package Guia05Vectores;
import java.util.Random;
/**
 *
 * @author j0k3r.rg
 */
public class ejercicio01 {
    public static void main (String argos [] ) {
        /*
        Generar numeros aleatorios desde un rango y de tipo
        */
        int num = 1;
        System.out.println(num);
        Random aleatorio = new Random();
        System.out.println("primer punto de corte");
        int num2 = 2;
        num = 10;
        System.out.println(num);
        System.out.println(num2);
        
        System.out.println(aleatorio.nextInt(-10,10));
        System.out.println("segundo punto de corte");
        int num3 = 3;
        num2 = 100;
        System.out.println(num3);
        System.out.println(num2);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("punto de corte en el for");
        }
        num3 = 100000;
        int num4 = 4;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("ultimo punto de corte");
    }
}
