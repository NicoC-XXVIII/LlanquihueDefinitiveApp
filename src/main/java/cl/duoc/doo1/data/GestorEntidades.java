package cl.duoc.doo1.data;

import cl.duoc.doo1.model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {
    private List<Registrable> entidades = new ArrayList<>();

    public GestorEntidades() {
        cargarDatosEjemplo();
    }

    private void cargarDatosEjemplo() {
        entidades.add(new GuiaTuristico("Nicolás", "Español", "nicolasguia@email", 5 ));
        entidades.add(new ColaboradorExterno("Salvavidas", "Javier"));
        entidades.add(new ColaboradorExterno("Médico", "Constanza"));
        entidades.add(new Vehiculo("Furgón", 8));
    }

    public void AgregarEntidad(Registrable r) {
        entidades.add(r);
    }

    public List<Registrable> getEntidades() {
        return entidades;
    }

    public void mostrarEntidades() {
        System.out.println("==Registros de Llanquihue Tout==");
        for (Registrable r : entidades) {
            r.mostrarResumen();

            if (r instanceof GuiaTuristico){
                System.out.println(" → Es un guía turístico.\nDisponible para selección");
            } else if(r instanceof ColaboradorExterno) {
                System.out.println(" → Es un colaborador externo. \nDisponible para asignar");
            } else if(r instanceof Vehiculo) {
                System.out.println(" → Es un vehículo. \nDisponible para transporte");

                }

            }
        }
}
