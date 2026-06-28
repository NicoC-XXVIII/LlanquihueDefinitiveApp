package cl.duoc.doo1.model;

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;
    private String clima;
    private String horario;
    private int distanciaKm;

    public PaseoLacustre(String nombre, String duracionHoras,
                         String tipoEmbarcacion, String clima,
                         String horario, int distanciaKm) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.clima = clima;
        this.horario = horario;
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String toString() {
        return "Paseo Lacustre [Tipo de embarcación= " + tipoEmbarcacion +
                "| Clima= " + clima + "| Horario= " + horario +
                "\n| Distancia= " + distanciaKm + " kms]";
    }
}
