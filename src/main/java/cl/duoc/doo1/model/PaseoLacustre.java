package cl.duoc.doo1.model;

/**
 * Clase que representa un paseo lacustre en el lago Llanquihue.
 * 
 * Un paseo lacustre es un tipo de servicio turístico que permite a los visitantes
 * disfrutar de experiencias en embarcaciones por el hermoso lago Llanquihue,
 * considerado uno de los lagos más bonitos de Chile. El paseo incluye información
 * sobre el tipo de embarcación, condiciones climáticas esperadas, horario y
 * distancia total del recorrido.
 * 
 * Esta clase hereda de {@link ServicioTuristico} y proporciona atributos específicos
 * para caracterizar completamente la experiencia del paseo lacustre.
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 * @see ServicioTuristico
 */
public class PaseoLacustre extends ServicioTuristico{
    
    /** Tipo de embarcación utilizado en el paseo (ej: Ferri, Kayak, Velero, etc.) */
    private String tipoEmbarcacion;
    
    /** Condiciones climáticas esperadas durante el paseo (ej: Soleado, Nuboso, Lluvioso) */
    private String clima;
    
    /** Horario en el que se realiza el paseo (ej: Mañana, Tarde, Noche) */
    private String horario;
    
    /** Distancia total del recorrido en kilómetros */
    private int distanciaKm;

    /**
     * Constructor que inicializa un paseo lacustre con todos sus atributos.
     * 
     * @param nombre el nombre del paseo lacustre
     * @param duracionHoras la duración del paseo en horas
     * @param precio el precio del paseo en pesos chilenos
     * @param tipoEmbarcacion el tipo de embarcación a utilizar
     * @param clima las condiciones climáticas esperadas
     * @param horario el horario del paseo
     * @param distanciaKm la distancia total del recorrido en kilómetros
     */
    public PaseoLacustre(String nombre, String duracionHoras, double precio,
                         String tipoEmbarcacion, String clima,
                         String horario, int distanciaKm) {
        super(nombre, duracionHoras, precio);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.clima = clima;
        this.horario = horario;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Muestra la información detallada del paseo lacustre en consola.
     * 
     * Este método sobrescribe el método {@link ServicioTuristico#mostrarInfo()}
     * para mostrar información específica de los paseos lacustres,
     * incluyendo el tipo de embarcación, clima, horario y distancia del recorrido.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("\n-Paseo Lacustre-");
        System.out.println("Nombre del Tour: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("Clima: " + clima);
        System.out.println("Horario: " + horario);
        System.out.println("Distancia del recorrido: " + distanciaKm + " km");
    }
}
