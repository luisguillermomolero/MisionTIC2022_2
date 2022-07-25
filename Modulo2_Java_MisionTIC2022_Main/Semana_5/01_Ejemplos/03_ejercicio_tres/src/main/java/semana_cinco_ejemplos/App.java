//Ejemplo de java JButton con ActionListener
package semana_cinco_ejemplos;

import java.awt.event.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        JFrame f = new JFrame("Listener Example");

        JLabel jl1 = new JLabel("Nombre");
        jl1.setBounds(40, 50, 150, 20);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 50, 150, 20);

        JButton boton1 = new JButton("Apellido");
        boton1.setBounds(50, 150, 95, 30);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("Molero");
            }
        });

        f.add(jl1);
        f.add(boton1);
        f.add(tf1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}