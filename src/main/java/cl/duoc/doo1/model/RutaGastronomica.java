package cl.duoc.doo1.model;

import java.util.Queue;

public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;
    private String tipo;

    public RutaGastronomica(String nombre, String numeroHoras, double precio,
                            int numeroDeParadas, String tipo) {
        super(nombre, numeroHoras, precio);
        this.numeroDeParadas = numeroDeParadas;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n-Ruta Gastronómica-");
        System.out.println("Nombre del Tour: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Precio: $" + precio);
        System.out.println("Paradas: " + numeroDeParadas);
        System.out.println("Tipo: " + tipo);


    }


}
