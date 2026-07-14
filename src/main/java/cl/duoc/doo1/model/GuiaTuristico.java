package cl.duoc.doo1.model;

public class GuiaTuristico implements Registrable {
    private String nombre;
    private String idioma;
    private String email;
    private int aniosExperiencia;

    public GuiaTuristico(String nombre, String idioma, String email,
                         int aniosExperiencia) {
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("--Guia Turístico--");
        System.out.println("Nombre: " + nombre);
        System.out.println("Idioma: " + idioma);
        System.out.println("Email: " + email);
        System.out.println("Años de experiencia: " + aniosExperiencia);

    }

    public String getNombre() {
        return nombre;
    }
}
