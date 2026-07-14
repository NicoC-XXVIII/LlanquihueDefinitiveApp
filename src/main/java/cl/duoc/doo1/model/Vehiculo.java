package cl.duoc.doo1.model;

public class Vehiculo implements Registrable {
    private String tipo;
    private int capacidad;

    public Vehiculo(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("--Vehiculo--");
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
    }

    public String getTipo() {
        return tipo;
    }


}
