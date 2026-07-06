package cl.duoc.doo1.model;

/**
 * Clase base abstracta que representa un servicio turístico genérico.
 * 
 * Esta clase define la estructura común y el comportamiento que comparten todos los
 * servicios turísticos ofrecidos en la región de Llanquihue. Proporciona atributos
 * básicos como nombre, duración y precio, así como métodos para acceder a esta información.
 * 
 * Las subclases deben sobrescribir el método {@code mostrarInfo()} para proporcionar
 * información específica de cada tipo de servicio turístico.
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 */
public class ServicioTuristico {
    
    /** Nombre del servicio turístico */
    protected String nombre;
    
    /** Duración del servicio en horas */
    protected String duracionHoras;
    
    /** Precio del servicio en pesos chilenos */
    protected double precio;

    /**
     * Constructor que inicializa un servicio turístico con valores predeterminados en caso de null.
     * 
     * @param nombre el nombre del servicio turístico. Si es null, se asigna "Nombre no especificado"
     * @param duracionHoras la duración del servicio en horas. Si es null, se asigna "Duración no especificada"
     * @param precio el precio del servicio en pesos chilenos. Los valores negativos se convierten a 0
     */
    public ServicioTuristico(String nombre, String duracionHoras, double precio) {
        this.nombre = nombre
                != null ? nombre: "Nombre no especificado";
        this.duracionHoras = duracionHoras
                != null ? duracionHoras: "Duración no especificada";
        this.precio = Math.max(0, precio);
    }

    /**
     * Obtiene el nombre del servicio turístico.
     * 
     * @return el nombre del servicio turístico
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la duración del servicio turístico.
     * 
     * @return la duración del servicio en horas
     */
    public String getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Obtiene el precio del servicio turístico.
     * 
     * @return el precio del servicio en pesos chilenos
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Muestra la información básica del servicio turístico en consola.
     * 
     * Este método imprime el nombre, duración y precio del servicio. Las subclases
     * deben sobrescribir este método para mostrar información adicional específica
     * de cada tipo de servicio turístico.
     * 
     * @see ExcursionCultural#mostrarInfo()
     * @see PaseoLacustre#mostrarInfo()
     * @see RutaGastronomica#mostrarInfo()
     */
    public void mostrarInfo() {
        System.out.println("\n-Información-");
        System.out.println("Nombre del tour: " + nombre);
        System.out.println("Duración del tour: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
    }
}
