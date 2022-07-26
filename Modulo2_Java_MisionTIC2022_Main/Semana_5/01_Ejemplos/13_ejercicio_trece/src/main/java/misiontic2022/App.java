package misiontic2022;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String args[]) {
        // Creando la ventana principal
        JFrame Ventana = new JFrame("Chat Frame");
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setSize(800, 400);

        // Creando MenuBar y agregando componentes
        JMenuBar menuBar = new JMenuBar();
        JMenu MenuArchivo = new JMenu("ARCHIVO");
        JMenu MenuAyuda = new JMenu("Ayuda");
        menuBar.add(MenuArchivo);
        menuBar.add(MenuAyuda);
        JMenuItem MenuArchivoAbrir = new JMenuItem("Abrir");
        JMenuItem MenuArchivoAGuardarComo = new JMenuItem("Guardar como");
        MenuArchivo.add(MenuArchivoAbrir);
        MenuArchivo.add(MenuArchivoAGuardarComo);

        // Creando el panel en la parte inferior
        JPanel PanelInferior = new JPanel();
        JLabel EtiquetaIntroducirTexto = new JLabel("Introducir texto");
        JTextField CampoTexto = new JTextField(10);
        JButton BotonEnviar = new JButton("Enviar");
        JButton BotonReset = new JButton("Restablecer");
        PanelInferior.add(EtiquetaIntroducirTexto);
        PanelInferior.add(CampoTexto);
        PanelInferior.add(BotonEnviar);
        PanelInferior.add(BotonReset);

        // Área de texto en el centro
        JTextArea AreaDeTexto = new JTextArea();

        // Agregar componentes al marco.
        Ventana.getContentPane().add(BorderLayout.NORTH, menuBar);
        Ventana.getContentPane().add(BorderLayout.CENTER, AreaDeTexto);
        Ventana.getContentPane().add(BorderLayout.SOUTH, PanelInferior);
        Ventana.setVisible(true);
    }
}