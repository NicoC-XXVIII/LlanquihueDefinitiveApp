package cl.duoc.doo1.model;

/**
 * Clase que representa una excursión cultural.
 * 
 * Una excursión cultural es un tipo de servicio turístico que lleva a los visitantes
 * a lugares históricos y emblemáticos de la región de Llanquihue con la guía de
 * profesionales especializados en historia y cultura local.
 * 
 * Esta clase hereda de {@link ServicioTuristico} y añade atributos específicos
 * como el lugar histórico a visitar y el número de guías que acompañarán la excursión.
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 * @see ServicioTuristico
 */
public class ExcursionCultural extends ServicioTuristico{
    
    /** Nombre del lugar histórico a visitar durante la excursión */
    private String lugarHistorico;
    
    /** Número de guías que acompañarán la excursión */
    public int numeroGuias;

    /**
     * Constructor que inicializa una excursión cultural con todos sus atributos.
     * 
     * @param nombre el nombre de la excursión cultural
     * @param duracionHoras la duración de la excursión en horas
     * @param precio el precio de la excursión en pesos chilenos
     * @param lugarHistorico el nombre del lugar histórico a visitar
     * @param numeroGuias la cantidad de guías que acompañarán la excursión
     */
    public ExcursionCultural(String nombre, String duracionHoras, double precio,
                             String lugarHistorico, int numeroGuias) {
        super(nombre, duracionHoras, precio);
        this.lugarHistorico = lugarHistorico;
        this.numeroGuias = numeroGuias;
    }

    /**
     * Muestra la información detallada de la excursión cultural en consola.
     * 
     * Este método sobrescribe el método {@link ServicioTuristico#mostrarInfo()}
     * para mostrar información específica de las excursiones culturales,
     * incluyendo el lugar histórico y el número de guías.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n-Excursión Cultural-");
        System.out.println("Nombre del Tour: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Lugar histórico: " + lugarHistorico);
        System.out.println("Número de guias: " + numeroGuias);
    }
}
