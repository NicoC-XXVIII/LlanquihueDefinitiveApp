package cl.duoc.doo1.model;

public class ColaboradorExterno implements Registrable{
    private String tipo;
    private String nombre;

    public ColaboradorExterno(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("--Colaborador Externo--");
        System.out.println("Tipo: " + tipo);
        System.out.println("Nombre: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
