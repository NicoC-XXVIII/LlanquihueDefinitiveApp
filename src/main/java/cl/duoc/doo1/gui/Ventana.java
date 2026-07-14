package cl.duoc.doo1.gui;

import cl.duoc.doo1.model.GuiaTuristico;
import cl.duoc.doo1.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.function.Function;

public class Ventana extends JFrame {

    private final ArrayList<GuiaTuristico> guiasData = new ArrayList<>();
    private final ArrayList<ColaboradorExterno> colaboradoresData = new ArrayList<>();
    private final ArrayList<Vehiculo> vehiculosData = new ArrayList<>();

    private final DefaultComboBoxModel<GuiaTuristico> guiasComboModel = new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<ColaboradorExterno> colaboradoresComboModel = new DefaultComboBoxModel<>();
    private final DefaultComboBoxModel<Vehiculo> vehiculosComboModel = new DefaultComboBoxModel<>();

    private final JList<GuiaTuristico> guiasList = new JList<>();
    private final JList<ColaboradorExterno> colaboradoresList = new JList<>();
    private final JList<Vehiculo> vehiculosList = new JList<>();

    public Ventana() {

        super("Llanquihue Tour");

        setSize(900, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        guiasList.setCellRenderer(new NombreRenderer<>(GuiaTuristico::getNombre));
        colaboradoresList.setCellRenderer(new NombreRenderer<>(ColaboradorExterno::getNombre));
        vehiculosList.setCellRenderer(new NombreRenderer<>(Vehiculo::getTipo));


        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Guía Turístico", crearPanelGuia());
        tabs.addTab("Colaborador Externo", crearPanelColaborador());
        tabs.addTab("Vehículo", crearPanelVehiculo());

        setContentPane(tabs);
    }


    private JPanel crearPanelGuia() {

        JTextField nombre = new JTextField();
        JTextField idioma = new JTextField();
        JTextField email = new JTextField();
        JTextField aniosExperiencia = new JTextField();

        JPanel guia = new JPanel(new GridLayout(0, 2, 5, 5));
        guia.setBorder(BorderFactory.createTitledBorder("Agregar Guía"));

        guia.add(new JLabel("Nombre:"));
        guia.add(nombre);
        guia.add(new JLabel("Idioma:"));
        guia.add(idioma);
        guia.add(new JLabel("Email:"));
        guia.add(email);
        guia.add(new JLabel("Años de experiencia:"));
        guia.add(aniosExperiencia);

        JButton agregar = new JButton("Confirmar solicitud");
        agregar.addActionListener(e -> {
            try {
                GuiaTuristico gt = new GuiaTuristico(
                        nombre.getText(),
                        idioma.getText(),
                        email.getText(),
                        Integer.parseInt(aniosExperiencia.getText().trim())
                );

                agregarGuia(gt);

                nombre.setText("");
                idioma.setText("");
                email.setText("");
                aniosExperiencia.setText("");

                JOptionPane.showMessageDialog(this, "¡Guía agregado correctamente!");

            } catch (NumberFormatException exp) {
                JOptionPane.showMessageDialog(this, "Años de experiencia debe ser un número válido");
            }
        });

        JPanel top = new JPanel(new BorderLayout());
        top.add(guia, BorderLayout.CENTER);
        top.add(agregar, BorderLayout.SOUTH);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(top, BorderLayout.NORTH);
        panel.add(new JScrollPane(guiasList), BorderLayout.CENTER);

        return panel;
    }

    private void agregarGuia(GuiaTuristico gt) {
        guiasData.add(gt);
        guiasComboModel.addElement(gt);
        guiasList.setListData(guiasData.toArray(new GuiaTuristico[0]));
    }


    private JPanel crearPanelColaborador() {

        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Médico", "Salvavidas", "Fotógrafo"});

        CardLayout cardLayout = new CardLayout();
        JPanel especialidad = new JPanel(cardLayout);

        JPanel pnlSalvavidas = asignarEspecialidad("Salvavidas", "Javier");
        JPanel pnlMedico = asignarEspecialidad("Médico", "Constanza");
        JPanel pnlFotografo = asignarEspecialidad("Fotógrafo", "Yeraldi");

        especialidad.add(pnlSalvavidas, "Salvavidas");
        especialidad.add(pnlMedico, "Médico");
        especialidad.add(pnlFotografo, "Fotógrafo");

        tipoCombo.addActionListener(e ->
                cardLayout.show(especialidad, (String) tipoCombo.getSelectedItem())
        );

        JPanel formulario = new JPanel();
        formulario.add(new JLabel("Asignar colaborador:"));
        formulario.add(tipoCombo);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(formulario, BorderLayout.NORTH);
        panel.add(especialidad, BorderLayout.CENTER);
        panel.add(new JScrollPane(colaboradoresList), BorderLayout.SOUTH);

        return panel;
    }

    private JPanel asignarEspecialidad(String tipo, String nombre) {

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JTextField txtNombreColab = new JTextField(nombre);
        JTextField txtEspecialidad = new JTextField();

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombreColab);
        panel.add(new JLabel("Especialidad:"));
        panel.add(txtEspecialidad);

        JButton btnAsignar = new JButton("Guardar cambios");
        btnAsignar.addActionListener(e -> {

            ColaboradorExterno collab = new ColaboradorExterno(
                    txtEspecialidad.getText(),
                    txtNombreColab.getText()
            );

            colaboradoresData.add(collab);
            colaboradoresComboModel.addElement(collab);
            colaboradoresList.setListData(colaboradoresData.toArray(new ColaboradorExterno[0]));

            JOptionPane.showMessageDialog(this, tipo + " asignado correctamente");
        });

        panel.add(new JLabel(""));
        panel.add(btnAsignar);

        return panel;
    }


    private JPanel crearPanelVehiculo() {

        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Furgón", "Bote", "Bus"});

        CardLayout card = new CardLayout();
        JPanel modeloEspecifico = new JPanel(card);

        JPanel pnlFurgon = formularioVehiculo("Furgón", 8);
        JPanel pnlBote = formularioVehiculo("Bote", 5);
        JPanel pnlBus = formularioVehiculo("Bus", 30);

        modeloEspecifico.add(pnlFurgon, "Furgón");
        modeloEspecifico.add(pnlBote, "Bote");
        modeloEspecifico.add(pnlBus, "Bus");

        tipoCombo.addActionListener(e ->
                card.show(modeloEspecifico, (String) tipoCombo.getSelectedItem())
        );

        JPanel formulario = new JPanel();
        formulario.add(new JLabel("Tipo de vehículo"));
        formulario.add(tipoCombo);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(formulario, BorderLayout.NORTH);
        panel.add(modeloEspecifico, BorderLayout.CENTER);
        panel.add(new JScrollPane(vehiculosList), BorderLayout.SOUTH);

        return panel;
    }

    private JPanel formularioVehiculo(String tipo, int capacidad) {

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JTextField txtTipo = new JTextField(tipo);
        JTextField txtCapacidad = new JTextField(String.valueOf(capacidad));

        panel.add(new JLabel("Modelo:"));
        panel.add(txtTipo);
        panel.add(new JLabel("Capacidad:"));
        panel.add(txtCapacidad);

        JButton btnGuardar = new JButton("Guardar " + tipo);
        btnGuardar.addActionListener(e -> {

            Vehiculo vehiculo = new Vehiculo(
                    txtTipo.getText(),
                    Integer.parseInt(txtCapacidad.getText())
            );

            vehiculosData.add(vehiculo);
            vehiculosComboModel.addElement(vehiculo);
            vehiculosList.setListData(vehiculosData.toArray(new Vehiculo[0]));

            JOptionPane.showMessageDialog(this, tipo + " guardado correctamente");
        });

        panel.add(new JLabel(""));
        panel.add(btnGuardar);

        return panel;
    }


    private static class NombreRenderer<T> extends DefaultListCellRenderer {

        private final Function<T, String> obtenerNombre;

        NombreRenderer(Function<T, String> obtenerNombre) {
            this.obtenerNombre = obtenerNombre;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {

            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value != null) {
                setText(obtenerNombre.apply((T) value));
            }

            return this;
        }
    }
}
