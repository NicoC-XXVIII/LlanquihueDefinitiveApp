package cl.duoc.doo1.ui;

import cl.duoc.doo1.data.*;
import cl.duoc.doo1.model.*;

/**
 * Clase principal de la aplicación LlanquihueDefinitiveApp.
 * 
 * Esta clase contiene el punto de entrada de la aplicación. Inicializa el gestor
 * de servicios y muestra la lista completa de servicios turísticos disponibles
 * en la región de Llanquihue.
 * 
 * La aplicación es un sistema de gestión de servicios turísticos desarrollado
 * como evaluación formativa 4 (F4) de la asignatura DOO1 (Diseño Orientado a Objetos)
 * del DUOC UC.
 * 
 * @author NicoC-XXVIII
 * @version 1.0
 * @since 2026-07-06
 * @see GestorServicios
 */
public class Main {
    
    /**
     * Método principal de la aplicación.
     * 
     * Este método es el punto de entrada de la aplicación. Imprime un encabezado
     * de bienvenida, crea una instancia del gestor de servicios y ejecuta
     * el método para mostrar todos los servicios turísticos disponibles.
     * 
     * @param args argumentos de línea de comandos (no utilizados en esta versión)
     */
    public static void main(String[] args) {
        System.out.println("\n===LLANQUIHUE TOUR===");
        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
}
