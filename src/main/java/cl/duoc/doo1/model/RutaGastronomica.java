package cl.duoc.doo1.model;

/**
 * Clase que representa una ruta gastronómica en Llanquihue.
 * 
 * Una ruta gastronómica es un tipo de servicio turístico que ofrece a los visitantes
 * la oportunidad de conocer y degustar la cocina local de la región de Llanquihue.
 * Este recorrido incluye múltiples paradas en establecimientos gastronómicos
 * seleccionados, permitiendo a los turistas experimentar los sabores auténticos
 * de la zona.
 * 
 * Esta clase hereda de {@link ServicioTuristico} y añade atributos específicos
 * como el número de paradas gastronómicas y la descripción del tipo de comida
 * que será servida durante el recorrido.
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 * @see ServicioTuristico
 */
public class RutaGastronomica extends ServicioTuristico{
    
    /** Número de paradas gastronómicas incluidas en la ruta */
    private int numeroDeParadas;
    
    /** Descripción del tipo de comida incluida en la ruta (ej: "Almuerzo y postre", "Comida y bar") */
    private String tipo;

    /**
     * Constructor que inicializa una ruta gastronómica con todos sus atributos.
     * 
     * @param nombre el nombre de la ruta gastronómica
     * @param numeroHoras la duración de la ruta en horas
     * @param precio el precio de la ruta en pesos chilenos
     * @param numeroDeParadas la cantidad de paradas gastronómicas incluidas
     * @param tipo la descripción del tipo de comida incluida en la ruta
     */
    public RutaGastronomica(String nombre, String numeroHoras, double precio,
                            int numeroDeParadas, String tipo) {
        super(nombre, numeroHoras, precio);
        this.numeroDeParadas = numeroDeParadas;
        this.tipo = tipo;
    }

    /**
     * Muestra la información detallada de la ruta gastronómica en consola.
     * 
     * Este método sobrescribe el método {@link ServicioTuristico#mostrarInfo()}
     * para mostrar información específica de las rutas gastronómicas,
     * incluyendo el número de paradas y el tipo de comida incluida.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n-Ruta Gastronómica-");
        System.out.println("Nombre del Tour: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Paradas: " + numeroDeParadas);
        System.out.println("Tipo: " + tipo);
    }
}
