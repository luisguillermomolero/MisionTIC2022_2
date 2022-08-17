package misiontic2022;

import javax.swing.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener {
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup buttongroup;

    public Formulario() {
        setLayout(null);
        buttongroup = new ButtonGroup();

        // instanciar componentes "Botón"
        radio1 = new JRadioButton("640*480");
        radio1.setBounds(10, 20, 100, 30);

        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10, 70, 100, 30);

        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10, 120, 100, 30);

        // agregar listener
        radio1.addChangeListener(this);
        radio2.addChangeListener(this);
        radio3.addChangeListener(this);

        // agrego los componentes "Botón" al buttongroup
        buttongroup.add(radio1);
        buttongroup.add(radio2);
        buttongroup.add(radio3);

        // agrego los componentes "Botón" al jframe
        add(radio1);
        add(radio2);
        add(radio3);
    }

    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            setSize(640, 480);
        }
        if (radio2.isSelected()) {
            setSize(800, 600);
        }
        if (radio3.isSelected()) {
            setSize(1024, 768);
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 450, 450);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}