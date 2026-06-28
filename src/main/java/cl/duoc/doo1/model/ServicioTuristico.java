package cl.duoc.doo1.model;

public class ServicioTuristico {
    public String nombre;
    public String duracionHoras;

    public ServicioTuristico(String nombre, String duracionHoras) {
        this.nombre = nombre
                != null ? nombre: "Nombre no especificado";
        this.duracionHoras = duracionHoras
                != null ? duracionHoras: "Duración no especificada";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionHoras() {
        return duracionHoras;
    }

    public void mostrarInfo() {
        System.out.println("\nInformación:");
        System.out.println("Nombre del tour: " + nombre);
        System.out.println("Duración del tour: " + duracionHoras + " horas");
    }
}