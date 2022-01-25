/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misFrames;

import javax.swing.JOptionPane;

/**
 * TODA ESTA CLASE ES BASURA!
 * @author luis2
 */
public class Resulta {
    private int Rand_izq,Rand_dere,suma,sum_final;
    
    public Resulta(){
        //this.suma = 0;
    }
    
    public void rand_izquierda(int random){ //recibe el random de la izquierda y lo muestra
        this.Rand_izq = random;
        //System.out.println(Rand_izq);
        this.suma = this.suma + this.Rand_izq;
        System.out.println(suma);
    }
    public int rand_derecha(int random){ //recibe el random de la derecha
        this.Rand_dere = random;
        //System.out.println(Rand_dere);
        this.suma = this.suma + this.Rand_dere;
        System.out.println(suma);
        
        //Resolv(suma); //llama al metodo resolv y muestra en pantalla la suma
        
        //this.suma = 0; //resetea la variable suma para que no se acumule
        return suma;
    }
    
    public void get_resultado(String valor){ //recibe el string que el usuario pone en el menu principal
        //int val_final = Integer.parseInt(valor);
        //
        System.out.println(this.suma);
        int FINALE= 0;
        if ( valor != null ){
            System.out.println("error");
        }else{
            FINALE = Integer.parseInt(valor);
            System.out.println(FINALE);
        }
        System.out.println(this.suma);
        Resolv(this.suma,FINALE);
        
        //this.sum_final = 0;
        //this.suma= 0;
        //System.out.println(valor);
        
       
    }
    
    public void Resolv(int suma,int Finale){
        //int igual = this.Rand_dere + this.Rand_izq;
        //this.sum_final = suma;
        //System.out.println(sum_final);
        if( suma == Finale){
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    }
    
    
    
}
