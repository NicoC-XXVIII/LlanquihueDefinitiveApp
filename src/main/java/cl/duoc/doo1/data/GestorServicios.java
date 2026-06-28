package cl.duoc.doo1.data;
import cl.duoc.doo1.model.*;
import java.util.ArrayList;

public class GestorServicios {

    public ArrayList<ServicioTuristico> cargarServicios() {
        ArrayList<ServicioTuristico> servicios = new ArrayList<>();

        // Tours de tipo Excursión Cultural:
    servicios.add (new ExcursionCultural("Ruta mañanera", "4",
            "Las Palmas", 2));
    servicios.add (new ExcursionCultural("Paseo Nocturno", "2",
            "La Paz", 2));

    // Tours de tipo Paseo Lacustre:
    servicios.add (new PaseoLacustre("Lago Llanquihue", "3",
            "Ferri", "Frío", "Mañana", 20));
    servicios.add (new PaseoLacustre("Paseo Kayac", "1,5",
            "Kayak", "Soleado", "Tarde", 10));

    // Tours de tipo Ruta Gastronómica:
    servicios.add (new RutaGastronomica("Ruta Familiar", "2",
            3, "Almuerzo y postre", 25000));
    servicios.add (new RutaGastronomica("Ruta Adulta", "2",
            3, "Comida y bar", 18000));
    return servicios;
    }

}


