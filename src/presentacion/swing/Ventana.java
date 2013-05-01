package presentacion.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Ventana extends JFrame implements WindowListener {
    
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    
    public Ventana() {
        
        super();
        
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        getContentPane().setLayout(null);
        setTitle("Un ejemplo");
        
        jButton1.setBackground(java.awt.Color.red);
        jButton1.setText("Boton 1");
        getContentPane().add(jButton1);
        
        jButton1.setBounds(121, 146, 120, 50);
        jButton2.setText("Boton 2");
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 70, 77, 26);
        
        addWindowListener(this);
              
        pack();
    }
    
    public static void main(String args[]) {
        
        JFrame myWindow = new Ventana();
        myWindow.setSize(450,400);
        myWindow.setVisible(true);
        
    }
    
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
     }

    public void windowOpened(WindowEvent e) {
      
    }

    public void windowClosed(WindowEvent e) {
        
    }

    public void windowIconified(WindowEvent e) {
        
    }

    public void windowDeiconified(WindowEvent e) {
      
    }

    public void windowActivated(WindowEvent e) {
       
    }

    public void windowDeactivated(WindowEvent e) {
        
    }

}
