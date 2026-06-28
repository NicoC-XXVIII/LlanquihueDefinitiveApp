package cl.duoc.doo1.model;

import java.util.Queue;

public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;
    private String tipo;
    private int precio;

    public RutaGastronomica(String nombre, String numeroHoras,
                            int numeroDeParadas, String tipo, int precio) {
        super(nombre, numeroHoras);
        this.numeroDeParadas = numeroDeParadas;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ruta Gastronómica [Número de paradas= " + numeroDeParadas +
                "| Tipo= " + tipo + "| Precio= $" + precio + "]";
    }


}
