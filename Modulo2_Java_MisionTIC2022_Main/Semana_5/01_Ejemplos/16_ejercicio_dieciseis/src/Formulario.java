import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenuItem item1, item2, item3;

    public Formulario() {
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        item1 = new JMenuItem("Rojo");
        item1.addActionListener(this);
        menu1.add(item1);

        item2 = new JMenuItem("Verde");
        item2.addActionListener(this);
        menu1.add(item2);

        item3 = new JMenuItem("Azul");
        item3.addActionListener(this);
        menu1.add(item3);
    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
        if (e.getSource() == item1) {
            fondo.setBackground(new Color(255, 0, 0)); // rojo
        }
        if (e.getSource() == item2) {
            fondo.setBackground(new Color(0, 255, 0)); // Verde
        }
        if (e.getSource() == item3) {
            fondo.setBackground(new Color(0, 0, 255)); // Azul
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(10, 20, 300, 200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}