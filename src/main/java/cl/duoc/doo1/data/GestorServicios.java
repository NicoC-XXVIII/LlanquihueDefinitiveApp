package cl.duoc.doo1.data;
import cl.duoc.doo1.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

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

    public void mostrarServicios() {
        List<ServicioTuristico> servicios = cargarServicios();
        System.out.println("Lista de Servicios:");

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInfo();
        }

        System.out.println("\nTotal de servicios: " + servicios.size());
    }

}


