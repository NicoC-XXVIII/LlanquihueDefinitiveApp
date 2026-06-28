package cl.duoc.doo1.ui;

import cl.duoc.doo1.data.*;
import cl.duoc.doo1.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---LLANQUIHUE TOUR---");
        GestorServicios gestor = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestor.cargarServicios();

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInfo();
            System.out.println(servicio);
        }


    }





}