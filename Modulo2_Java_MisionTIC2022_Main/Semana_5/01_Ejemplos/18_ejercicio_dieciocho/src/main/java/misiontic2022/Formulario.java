package misiontic2022;

import javax.swing.*;

public class Formulario extends JFrame {

    private JTextField CampoTexto;
    private JTextArea AreaTexto;

    public Formulario() {
        setLayout(null);
        // crear nuevo componente de campo de texto
        CampoTexto = new JTextField();
        CampoTexto.setBounds(10, 10, 200, 30);

        // nuevo componente de área de texto
        AreaTexto = new JTextArea();
        AreaTexto.setBounds(10, 50, 400, 300);

        // agregando cada componente al jframe
        add(CampoTexto);
        add(AreaTexto);
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 540, 400);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}