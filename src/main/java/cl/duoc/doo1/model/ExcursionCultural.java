package cl.duoc.doo1.model;

public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;
    public int numeroGuias;

    public ExcursionCultural(String nombre, String duracionHoras, double precio,
                             String lugarHistorico, int numeroGuias) {
        super(nombre, duracionHoras, precio);
        this.lugarHistorico = lugarHistorico;
        this.numeroGuias = numeroGuias;
    }

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
