/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berserker;
import java.util.Scanner;
/**
 *
 * @author Abell
 */
public class Berserker {
private static Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        teclado=new Scanner(System.in);
        int[] z =new int[5];
        for(int a=0;a<5;a++) {
        System.out.println("INGRESE UN NUMERO CUALQUIERA "  + a +  " EL VECTORX ");
        z[a]=teclado.nextInt();
        }
        System.out.println("");
              
        System.out.println("VALORES INGRESADOS");
        System.out.println("");
        System.out.println("");
        for(int a=0; a<5; a++){
        System.out.println(" POSICION "  +  a  +  " VECTOR : "  + z[a]);
           
        }	
   
        for(int G=0;G<4;G++) {
            for(int a=0;a<4-G;a++) {
                if (z[a]>z[a+1]) {
                    int vectorx;
                    vectorx=z[a];
                   z[a]=z[a+1];
                    z[a+1]=vectorx;
                }
            }
        }
     System.out.println("");
              
     System.out.println("VALORES DEL VECTOR FORMA ASCENDENTE");
     System.out.println("");
     System.out.println("");      
     for(int a=0;a<5;a++) {
     System.out.println("POSICION " + a+ " VECTOR: "+ z[a]);
        }
        
          for(int G=0;G<4;G++) {
            for(int a=0;a<4-G;a++) {
                if (z[a]<z[a+1]) {
                    int vectorx;
                    vectorx=z[a];
                   z[a]=z[a+1];
                    z[a+1]=vectorx;
                }
            }
        }
     System.out.println("");
                 
        System.out.println("VALORES DEL VECTOR FORMA DESCENDENTE ");
         System.out.println("");
             System.out.println("");      
        for(int a=0;a<5;a++) {
             System.out.println("POSICION" + a + " EL VECTORX: "+ z[a]);
        }
        
    }
    
}
