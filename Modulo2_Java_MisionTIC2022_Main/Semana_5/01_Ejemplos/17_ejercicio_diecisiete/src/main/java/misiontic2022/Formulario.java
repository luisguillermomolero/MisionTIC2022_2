package misiontic2022;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener {

    private JComboBox<String> ComboEjemplo;

    public Formulario() {
        setLayout(null);

        // instanciar un nuevo combobox
        ComboEjemplo = new JComboBox<String>();
        ComboEjemplo.setBounds(10, 10, 80, 20);

        // items del combo
        ComboEjemplo.addItem("rojo");
        ComboEjemplo.addItem("verde");
        ComboEjemplo.addItem("azul");
        ComboEjemplo.addItem("amarillo");
        ComboEjemplo.addItem("negro");

        // listener del combobox
        ComboEjemplo.addItemListener(this);

        // agregando el combobox al jframe
        add(ComboEjemplo);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == ComboEjemplo) {
            String seleccionado = (String) ComboEjemplo.getSelectedItem();
            setTitle(seleccionado);
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 400);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
