import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField CampoTexto;
    private JLabel Etiqueta;
    private JButton BotonAceptar;

    public Formulario() {
        setLayout(null);
        // componente etiqueta
        Etiqueta = new JLabel("Usuario:");
        Etiqueta.setBounds(10, 10, 100, 30);

        // componente CampoTexto
        CampoTexto = new JTextField();
        CampoTexto.setBounds(120, 10, 150, 20);

        // componente botón
        BotonAceptar = new JButton("Aceptar");
        BotonAceptar.setBounds(10, 80, 100, 30);

        // listener del boton
        BotonAceptar.addActionListener(this);

        // incorporar los 3 componentes al jframe
        add(Etiqueta);
        add(CampoTexto);
        add(BotonAceptar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonAceptar) {
            String cad = CampoTexto.getText();
            setTitle(cad);
        }
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 350, 170);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}