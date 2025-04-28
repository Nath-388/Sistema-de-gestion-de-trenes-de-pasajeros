/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloInterfazUsuario;
import javax.swing.*;

public class VentanaEmergente extends JDialog {
    public VentanaEmergente(JFrame parent, boolean modal) {
        super(parent, modal);
        setTitle("Proceso exitoso");
        setSize(200, 100);
        setLayout(new java.awt.FlowLayout());

        // 👇 Aquí se pone el ícono
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Check-Badge--Streamline-Ultimate (2).png")).getImage());

        JLabel mensaje = new JLabel("¡Pago exitoso!");
        add(mensaje);

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}
