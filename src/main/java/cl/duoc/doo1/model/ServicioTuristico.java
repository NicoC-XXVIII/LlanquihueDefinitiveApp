package cl.duoc.doo1.model;

public class ServicioTuristico {
    protected String nombre;
    protected String duracionHoras;
    protected double precio;

    public ServicioTuristico(String nombre, String duracionHoras, double precio) {
        this.nombre = nombre
                != null ? nombre: "Nombre no especificado";
        this.duracionHoras = duracionHoras
                != null ? duracionHoras: "Duración no especificada";
        this.precio = Math.max(0, precio);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionHoras() {
        return duracionHoras;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInfo() {
        System.out.println("\n-Información-");
        System.out.println("Nombre del tour: " + nombre);
        System.out.println("Duración del tour: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
    }
}