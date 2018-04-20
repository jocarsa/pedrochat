
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
    
    String[] conversacion = new String[300];
    
    
    public Hablar(){
        panel = new JPanel();
        panel.setBounds(0,0,800,800);
        
        rotulo = new JLabel("Chat de Pedro");
         rotulo.setBounds(30,50,450,20);
        panel.add(rotulo);
        
        tuledices = new JTextField();
        tuledices.setBounds(30,100,450,20);
        add(tuledices);
        
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
        Hola como te encuentras
        conversacion[0] = "Hola como estas?";
        conversacion[1] = "Yo estoy bien, y tu?";
        // Aqui Pedro podrá poner sus cosas
        
        conversacion[2] = "Es tu primera prueba de GitHub?";
        conversacion[3] = "Si, hoy comparto mi primer repositorio";
        
        // Aqui Pedro podrá poner sus cosas
    }
     private void botonActionPerformed(java.awt.event.ActionEvent evt) { 
         // En primer lugar, quiero obtener el String de lo que he escrito, esto es una frase
         String escrito = tuledices.getText();
         // Preparo al programa para que trabaje con un conjunto de palabras
         
         // Palabras es la descomposicion de cada una de las palabras de la frase anterior
         
         // Ahora voy a ir conversacion a conversacion para encontrar la que mas se parezca a la que yo he escrito
         int mejorcandidato = 0;
         int puntuacionmejorcandidato = 0;
         for(int i = 0;i<=3;i++){
             int puntuacion = 0;
             String conversacionoriginal = conversacion[i];
             String[] palabrasgrupo1 = new String[100];
             palabrasgrupo1 = conversacionoriginal.split(" ");
             String[] palabrasgrupo2 = new String[100];
             palabrasgrupo2 = escrito.split(" ");
             System.out.println("Palabras en el primer grupo:");
             for(int p1 = 0;p1<palabrasgrupo1.length;p1++){
                 for(int p2 = 0;p2<palabrasgrupo2.length;p2++){
                     if(palabrasgrupo1[p1].equals(palabrasgrupo2[p2])){
                         puntuacion++;
                     }
                 }
             }
             //System.out.println("Que sepas que esta frase ha sacado: "+puntuacion+" puntos");
             if(puntuacion > puntuacionmejorcandidato){puntuacionmejorcandidato = puntuacion;mejorcandidato = i;}
        }
         System.out.println("Yo te respondo:"+conversacion[(mejorcandidato+1)]);
         elteresponde.setText(conversacion[(mejorcandidato+1)]);
             
    }
         
         //elteresponde.setText("El texto que has escrito es: "+);
         //elteresponde.setText(conversacion[0]);
     
    public static void main(String[] args) {
        // TODO code application logic here
       
        
         Hablar ventana = new Hablar();
        ventana.setBounds(50, 50, 800, 800);
        ventana.setVisible(true);
        
    }
    
    
    
}
