package cl.duoc.doo1.ui;

import cl.duoc.doo1.gui.Ventana;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> {
                    new Ventana().setVisible(true);
                });


            }


}