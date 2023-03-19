
package Guia05Vectores;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *  1 2 3          1 4 7
 *  4 5 6          2 5 8
 *  7 8 9          3 6 9
 * original     transpuesta
 * @author j0k3r.rg
 */
public class ejercicio04 {

    public static void main(String[] args) {
        //definimos y cargamos la matriz directamente
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("MATRIZ NORMAL: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("MATRIZ TRANSPUESTA");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
