package cl.duoc.doo1.model;

public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;
    public int numeroGuias;

    public ExcursionCultural(String nombre, String duracionHoras,
                             String lugarHistorico, int numeroGuias) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
        this.numeroGuias = numeroGuias;
    }

    @Override
    public String toString() {
        return "Excursión Cultural [Lugar histórico= " + lugarHistorico +
                "| Número de guias= " + numeroGuias + "]";
    }
}
