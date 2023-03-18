package Guia05Vectores;

/**
 *
 * @author j0k3r.rg
 */
public class ejercicio05 {

    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean verdadero = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -1 * (matriz[j][i]) && i != j) {
                    verdadero = false;
                    break;
                }
            }
            if (!verdadero) {
                break;
            }
        }
        if (verdadero) {
            System.out.println("la matriz SI ES antisimetrica");
        } else {
            System.out.println("la matriz NO ES antisimetrica");
        }
        for (int[] is : matriz) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

}
