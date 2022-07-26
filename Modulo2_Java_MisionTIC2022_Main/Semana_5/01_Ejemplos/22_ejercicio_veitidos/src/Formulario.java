import javax.swing.*;

public class Formulario extends JFrame {

    private JLabel EtiquetaSistema, EtiquetaVersion;

    public Formulario() {
        setLayout(null);

        // Instanciar componente etiqueta del sistema
        EtiquetaSistema = new JLabel("Sistema de Facturación.");
        EtiquetaSistema.setBounds(10, 20, 300, 30);
        // instanciar componente etiqueta de versión
        EtiquetaVersion = new JLabel("Vesion 1.0");
        EtiquetaVersion.setBounds(10, 100, 100, 30);

        // agregar componentes al jframe
        add(EtiquetaSistema);
        add(EtiquetaVersion);
    }

    public static void main(String[] ar) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 300, 200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
