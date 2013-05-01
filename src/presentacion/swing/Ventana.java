package presentacion.swing;

public class Ventana extends javax.swing.JFrame {
    
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    
    public Ventana() {
        
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
              
        pack();
    }
    
    public static void main(String args[]) {
        
        new Ventana().setVisible(true);
        
    }

}
