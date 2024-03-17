package tabla.ventanadepractica;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author juanfelipequiroga
 */

public class VentanaDePractica {

    public static void main(String[] args) {
        
        ImageIcon imagen1 = new ImageIcon("1.png");
               
        JLabel texto = new JLabel();
        texto.setText("Prueba Número 1");
        texto.setIcon(imagen1);
        
        JPanel panelBlanco = new JPanel();
        panelBlanco.setBackground(Color.white);
        panelBlanco.setBounds(0,0,300,200);
        
        JPanel panelGris = new JPanel();
        panelGris.setBackground(Color.gray);
        panelGris.setBounds(300,0,300,200);
        
        
        JPanel panelNegro = new JPanel();
        panelNegro.setBackground(Color.black);
        panelNegro.setBounds(0,200,600,200);
        
        
        JFrame ventana = new JFrame();        
        ventana.setTitle("Ventana de Practica");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.setSize(600,400);
        ventana.setVisible(true);
        ventana.add(panelBlanco);
        panelBlanco.add(texto);
        ventana.add(panelGris);
        ventana.add(panelNegro);
//        ventana.add(texto);
        
        
        
        
        
    }
}
