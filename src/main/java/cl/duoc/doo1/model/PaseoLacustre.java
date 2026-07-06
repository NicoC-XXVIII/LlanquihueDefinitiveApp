package cl.duoc.doo1.model;

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;
    private String clima;
    private String horario;
    private int distanciaKm;

    public PaseoLacustre(String nombre, String duracionHoras, double precio,
                         String tipoEmbarcacion, String clima,
                         String horario, int distanciaKm) {
        super(nombre, duracionHoras, precio);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.clima = clima;
        this.horario = horario;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n-Paseo Lacustre-");
        System.out.println("Nombre del Tour" + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("Clima: " + clima);
        System.out.println("Horario: " + horario);
        System.out.println("Distancia del recorrido: " + distanciaKm + " km");
    }
}
