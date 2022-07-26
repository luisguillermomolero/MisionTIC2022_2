package misiontic2022;

import javax.swing.*;

public class Formulario extends JFrame {

    private JLabel Etiqueta;

    public Formulario() {
        setLayout(null);
        Etiqueta = new JLabel("Hola Mundo.");
        Etiqueta.setBounds(10, 20, 200, 30);
        add(Etiqueta);
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(10, 10, 400, 300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}