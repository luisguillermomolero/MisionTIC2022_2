import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    JButton BotonFinalizar;

    public Formulario() {
        setLayout(null);

        // instanciar componente botón
        BotonFinalizar = new JButton("Finalizar");
        BotonFinalizar.setBounds(300, 250, 100, 30);
        // listener del botón
        BotonFinalizar.addActionListener(this);
        // agregando el botón al jframe
        add(BotonFinalizar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonFinalizar) {
            System.exit(0);
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 450, 350);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}