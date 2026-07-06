package cl.duoc.doo1.data;
import cl.duoc.doo1.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestora de servicios turísticos.
 * 
 * Esta clase es responsable de la carga, gestión y presentación de los servicios
 * turísticos disponibles en la región de Llanquihue. Actúa como una capa de datos
 * que centraliza la creación de instancias de servicios turísticos y proporciona
 * métodos para acceder a ellos.
 * 
 * Los servicios incluyen:
 * <ul>
 *   <li>Excursiones Culturales</li>
 *   <li>Paseos Lacustres</li>
 *   <li>Rutas Gastronómicas</li>
 * </ul>
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 * @see ServicioTuristico
 * @see ExcursionCultural
 * @see PaseoLacustre
 * @see RutaGastronomica
 */
public class GestorServicios {

    /**
     * Carga una lista con todos los servicios turísticos disponibles.
     * 
     * Este método crea instancias de diferentes tipos de servicios turísticos
     * y los añade a una lista. Los servicios se distribuyen en tres categorías:
     * excursiones culturales, paseos lacustres y rutas gastronómicas.
     * 
     * @return una lista de servicios turísticos disponibles en Llanquihue
     */
    public List<ServicioTuristico> cargarServicios() {
        List<ServicioTuristico> servicios = new ArrayList<>();

        // Tours de tipo Excursión Cultural:
        servicios.add (new ExcursionCultural("Ruta mañanera", "4",
                18000, "Las Palmas", 2));
        servicios.add (new ExcursionCultural("Paseo Nocturno", "2",
                22000, "La Paz", 2));

        // Tours de tipo Paseo Lacustre:
        servicios.add (new PaseoLacustre("Lago Llanquihue", "3",
                15000, "Ferri", "Nuboso", "Mañana", 4));
        servicios.add (new PaseoLacustre("Paseo Kayac", "1,5",
                15000, "Kayak", "Soleado", "Tarde", 2));

        // Tours de tipo Ruta Gastronómica:
        servicios.add (new RutaGastronomica("Degustación Familiar", "2",
                30000, 2, "Almuerzo y postre"));
        servicios.add (new RutaGastronomica("Ruta Adulta", "2",
                35000, 2, "Comida y bar"));
        return servicios;
    }

    /**
     * Muestra todos los servicios turísticos disponibles en consola.
     * 
     * Este método carga la lista de servicios disponibles y los muestra
     * uno por uno utilizando el método {@link ServicioTuristico#mostrarInfo()}.
     * Finalmente, muestra el total de servicios disponibles.
     * 
     * @see #cargarServicios()
     * @see ServicioTuristico#mostrarInfo()
     */
    public void mostrarServicios() {
        List<ServicioTuristico> servicios = cargarServicios();
        System.out.println("Lista de Servicios:");

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInfo();
        }

        System.out.println("\nTotal de servicios: " + servicios.size());
    }

}
