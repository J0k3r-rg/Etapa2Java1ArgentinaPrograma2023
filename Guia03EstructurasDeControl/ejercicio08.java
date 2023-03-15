package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *     * * * *
 *     *     *
 *     *     *
 *     * * * *
 * @author j0k3r.rg
 */
public class ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese tamanio del cuadrado a dibujar: ");
        int tamanio = leer.nextInt();
        
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i==0 || i == tamanio-1 || j==0 || j==tamanio-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
        leer.close();
    }
    
}
