package Guia00PruebasMias;

import java.util.Random;
/**
 *
 * @author j0k3r.rg
 */
public class pruebas02random {

    public static void main(String[] args) {
        /*
        Generar numeros aleatorios desde un rango y de tipo
        */
        int num = (int) (Math.random()*10); //genera numeros entre el 0 y el 9
        int num2 = (int) (Math.random()*100); //genera numeros entre el 0 y el 99
        System.out.println(num +" " + num2);
        
        // quiero generar numeros entre 20 y 50 ??
        num = (int) (Math.random()*(50-20) + 20); // con esa ecuacion puedo generar numeros random entre esos numeros
        System.out.println("NUMERO ALEATORIO ENTRE 20 Y 50: "+num);
        //otro ejemplo ahora desde el 8 al 123
        num2 = (int) (Math.random()*(123-8) + 8); // generamos un numero aleatorio entre 8 y 123 
        System.out.println("NUMERO ALEATORIO ENTRE 8 y 123: "+num2);
        
        //formula general
        int inicio = 8;
        int fin = 49;
        
        System.out.println("NUMERO ALEATORIO ENTRE "+inicio+" y "+fin+": "+(int)(Math.random()*(fin-inicio)+inicio));
        
        //NOTA MUY IMPORTANTE RECORDAR USAR BIEN LOS PARENTESIS YA QUE EL MAL USO DARA UN NUMERO FUERA DE RANGO
        
        System.out.println("PARENTESIS MAL COLOCADOS ENTRE "+inicio+" y "+fin+": "+(int)(Math.random()*(fin-inicio))+inicio);
        

        //generar numero aleratorio con objetos... recordar que este metodo sirve para java 17 o mas...
        // si utilizas el netbeans 8.2 y no te funciona es por que tienes un jdk viejo 
        //el cual no te permite realizarlo de esta manera... en caso de ser verdadero utilizar la formula anterior
        Random aleatorio = new Random();
        System.out.println("NUMERO ALEATORIO ENTRE -10 Y 10: "+aleatorio.nextInt(-10,10));
        
    }
    
}
