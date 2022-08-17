package misiontic2022;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JMenuBar BarraMenus;
    private JMenu MenuOpciones, MenuArchivo;
    private JMenuItem MenuOpcionRojo, MenuOpcionVerde, MenuOpcionAzul;

    public Formulario() {
        setLayout(null);

        // barra de menus
        BarraMenus = new JMenuBar();
        MenuOpciones = new JMenu("Opciones");
        MenuArchivo = new JMenu("Archivo");

        // opciones del menú "opciones"
        MenuOpcionRojo = new JMenuItem("Rojo");
        MenuOpcionVerde = new JMenuItem("Verde");
        MenuOpcionAzul = new JMenuItem("Azul");

        // listener de las opciones del menú "Opciones"
        MenuOpcionRojo.addActionListener(this);
        MenuOpcionVerde.addActionListener(this);
        MenuOpcionAzul.addActionListener(this);

        // Agregando el menuBar al jframe
        setJMenuBar(BarraMenus);

        // Agregando el menú "Opciones" al menuBar
        BarraMenus.add(MenuOpciones);
        BarraMenus.add(MenuArchivo);

        // Agregando las opciones del menú "Opciones"
        MenuOpciones.add(MenuOpcionRojo);
        MenuOpciones.add(MenuOpcionVerde);
        MenuOpciones.add(MenuOpcionAzul);
    }

    public void actionPerformed(ActionEvent e) {
        Container FondoVentana = this.getContentPane();
        if (e.getSource() == MenuOpcionRojo) {
            FondoVentana.setBackground(new Color(255, 0, 0)); // rojo
        }
        if (e.getSource() == MenuOpcionVerde) {
            FondoVentana.setBackground(new Color(0, 255, 0)); // Verde
        }
        if (e.getSource() == MenuOpcionAzul) {
            FondoVentana.setBackground(new Color(0, 0, 255)); // Azul
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(10, 20, 400, 400);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}