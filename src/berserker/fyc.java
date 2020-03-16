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
public class fyc {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int asiento, fila=0, columna=0;
        System.out.println("Ingrese el numero de asiento: ");
        asiento=teclado.nextInt();

        while(asiento>500){
            fila++;
            asiento=asiento-500;
        }
        fila++;
        columna=asiento;
        System.out.println("El asiento corresponde a la fila: "+fila+" y a la columna: "+columna);
    }
    
}
