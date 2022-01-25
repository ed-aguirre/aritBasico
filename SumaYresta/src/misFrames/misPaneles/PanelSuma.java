/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misFrames.misPaneles;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import misFrames.IconoPaloma;
import misFrames.IconoTacha;
import misFrames.Resulta;

/**
 *
 * @author luis2
 */
public class PanelSuma extends javax.swing.JPanel {
     private Image pelota,suma,igual,interro;
     private int val_izq, val_dere,total;
     public int addtiempo,aciertosS;
     //Resulta Valores = new Resulta();
    /**
     * Creates new form PanelSuma
     */
    public PanelSuma() {
        initComponents();
        
    }
    
     
    public void paintComponent(Graphics g){
            super.paintComponents(g);
            
            try{
              pelota = ImageIO.read(getClass().getResource("/imgs/bolaF.png"));
              suma = ImageIO.read(getClass().getResource("/imgs/suma.png"));
              igual = ImageIO.read(getClass().getResource("/imgs/equals.png"));
              interro = ImageIO.read(getClass().getResource("/imgs/interroga.png"));
            }catch(IOException e){
                System.out.println(e +" la imagen no se encuentra");
             }
            
            //metodo drawImage de la clase Graphics
            //g.drawImage(pelota,0, 0, null); //**primera base**
            
            //g.drawImage(pelota,500, 0,null); //**segunda base**
            
            g.drawImage(suma, 350, 110, null); //*suma imagen
            g.drawImage(igual, 830, 120, null); //*igual imagen
            g.drawImage(interro, 970, 110, null); //*interrogation mark imagen
            
            dame_random();
            
            rejilla(g);
            rejilla2(g);
           
        }
    
    public void rejilla(Graphics g){
           
            int random = this.val_izq;
            //Valores.rand_izquierda(random);
            
            for(int i=0;i<8;i++){
                for(int j = 1;j<=random;j++){
                    switch (j){
                        case 1 :
                            g.drawImage(pelota,0, 0, null); //base 1
                            break;
                        case 2:
                            g.copyArea(0, 0,100, 100,100*1, 100*0); //2
                            break;
                        case 3:
                            g.copyArea(0, 0,100, 100,100*2, 100*0); //3
                            break;
                        case 4:
                            g.copyArea(0, 0,100, 100,100*0, 100*1); //4
                            break;
                        case 5:
                            g.copyArea(0, 0,100, 100,100*1, 100*1); //5
                            break;
                        case 6:
                            g.copyArea(0, 0,100, 100,100*2, 100*1); //6
                            break;
                        case 7:
                            g.copyArea(0, 0,100, 100,100*0, 100*2); //7
                            break;
                        case 8:
                            g.copyArea(0, 0,100, 100,100*1, 100*2); //8
                            break;
                        case 9:
                            g.copyArea(0, 0,100, 100,100*2, 100*2); //9
                            break;
                    }
                }
          }
    }   
    
    public void rejilla2(Graphics g){
           
            int random = this.val_dere;
            //Valores.rand_derecha(random);
            
            for(int i=0;i<8;i++){
                for(int j = 0;j<=random;j++){
                    switch (j){
                        case 1: 
                            g.drawImage(pelota,500, 0,null); //segunda base 1
                            break;
                        case 2:
                            g.copyArea(500, 0,100, 100,100*1, 100*0); //2
                            break;
                        case 3:
                            g.copyArea(500, 0,100, 100,100*2, 100*0); //3
                            break;
                        case 4:
                            g.copyArea(500, 0,100, 100,100*0, 100*1); //4
                            break;
                        case 5:
                            g.copyArea(500, 0,100, 100,100*1, 100*1); //5
                            break;
                        case 6:
                            g.copyArea(500, 0,100, 100,100*2, 100*1); //6
                            break;
                        case 7:
                            g.copyArea(500, 0,100, 100,100*0, 100*2); //7
                            break;
                        case 8:
                            g.copyArea(500, 0,100, 100,100*1, 100*2); //8
                            break;
                        case 9:
                            g.copyArea(500, 0,100, 100,100*2, 100*2); //9
                            break;
                    }
                }
          }
    }   
    
    public void dame_random(){ //este metodo se pondra en el lugar del arreglo bidimensional para recibir el random
        
        do{
            this.val_izq = (int)(Math.random()*9)+1;
            this.val_dere = (int)(Math.random()*9)+1;
            
            this.total = val_izq + val_dere;
        }while(this.total > 9);
        //Calculos(total);
        // int range = (max - min) + 1;     ESTO PARA PONER RANGO EN UN MARH RANDOM
        //return (int)(Math.random() * range) + min;
    }
    public void Calculos(String val_div){
        IconoPaloma bien = new IconoPaloma();
        IconoTacha mal = new IconoTacha();
        
        if (val_div.isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "No existe un número", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null,"error");
        }else{
            int finale = Integer.parseInt(val_div);
            //System.out.println(finale);
            if( finale == this.total){
                aciertosS++;
                addtiempo = 15;
                JOptionPane.showMessageDialog(null, 
                        "¡Resultado correcto!\nEl resultado es "+this.total, 
                        "Muy bien :)", JOptionPane.DEFAULT_OPTION, 
                        bien);
            }else{
                addtiempo= 0;
                 JOptionPane.showMessageDialog(null, 
                        "¡Resultado incorrecto!\nEl resultado es "+this.total, 
                        "Mal :(", JOptionPane.DEFAULT_OPTION, 
                        mal);
            }
        }
        //System.out.println(this.total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1148, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
