package misiontic2022;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String args[]) {
        // Creando la ventana principal
        JFrame Ventana = new JFrame("Chat Frame");
        Ventana.setSize(800, 400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Parte superior del jframe (ventada)

        // Instancia de la barra de menús, las opciones de la barra y los items de la
        // opción "Archivo"
        JMenuBar menuBar = new JMenuBar();
        JMenu MenuAyuda = new JMenu("Ayuda");
        JMenu MenuArchivo = new JMenu("Archivo");
        JMenuItem MenuArchivoAbrir = new JMenuItem("Abrir");
        JMenuItem MenuArchivoAGuardarComo = new JMenuItem("Guardar como");

        // agregamos la opción "Archivo" y "Ayuda" a la barra de menús
        menuBar.add(MenuArchivo);
        menuBar.add(MenuAyuda);
        // agregamos los items al menú "Archivo"
        MenuArchivo.add(MenuArchivoAbrir);
        MenuArchivo.add(MenuArchivoAGuardarComo);

        // Área de texto en el centro
        JTextArea AreaDeTexto = new JTextArea();

        // Parte baja del jframe (ventana)
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

        // Agregando componentes al jframe (ventana)
        Ventana.getContentPane().add(BorderLayout.NORTH, menuBar);
        Ventana.getContentPane().add(BorderLayout.CENTER, AreaDeTexto);
        Ventana.getContentPane().add(BorderLayout.SOUTH, PanelInferior);
        Ventana.setVisible(true);
    }
}