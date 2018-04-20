
package hablar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Hablar extends JFrame  {
    JLabel rotulo;
    JTextField tuledices;
    JLabel elteresponde;
    JButton enviar;
    JButton correcto;
    JButton incorrecto;
    JPanel panel;
    
    String[] conversacion = new String[3];
    
    
    public Hablar(){
        panel = new JPanel();
        panel.setBounds(0,0,800,800);
        
        rotulo = new JLabel("Chat de Pedro");
         rotulo.setBounds(30,50,450,20);
        panel.add(rotulo);
        
        tuledices = new JTextField();
        tuledices.setBounds(30,100,450,20);
        panel.add(tuledices);
        
        enviar = new JButton("Envia");
        enviar.setBounds(30,150,450,20);
        panel.add(enviar); 
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
                
         elteresponde = new JLabel("Respuesta de la maquina");
         elteresponde.setBounds(30,200,450,20);
        panel.add(elteresponde);
        
        correcto = new JButton("OK");
        correcto.setBounds(30,150,450,20);
        panel.add(correcto);
        
        incorrecto = new JButton("No");
        incorrecto.setBounds(30,50,450,20);
        panel.add(incorrecto); 
        

        add(panel);
        // Algo
        
        conversacion[0] = "Hola como estas?";
        conversacion[1] = "Yo estoy bien, y tu?";
        // Aqui Pedro podrá poner sus cosas
        
        // Aqui Pedro podrá poner sus cosas
    }
     private void botonActionPerformed(java.awt.event.ActionEvent evt) { 
         System.out.println("Has pulsado un boton");
         elteresponde.setText(conversacion[0]);
     }
    public static void main(String[] args) {
        // TODO code application logic here
       
        
         Hablar ventana = new Hablar();
        ventana.setBounds(50, 50, 800, 800);
        ventana.setVisible(true);
        
    }
    
    
    
}
