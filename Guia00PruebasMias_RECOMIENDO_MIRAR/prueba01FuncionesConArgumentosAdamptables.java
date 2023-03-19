package Guia00PruebasMias_RECOMIENDO_MIRAR;
/**
 * DE CURIOSO AVERIGUE Y PUSE EN PRACTICA LO DE FUNCIONES CON ARGUMENTOS AUTO REGULABLES
 * POR DECIRLO DE UNA MANERA, SE PUEDE SOLUCIONAR DE 2 MANERAS... 
 * LA PRIMERA--- PASANDOLE UNA LISTA O UN ARRAY CON TODOS LOS DATOS 
 * LAS SEGUNDA-- DEPENDIENDO DEL JDK SE PUEDE PREPARAR LA FUNCION PARA QUE RECIBA VARIOS
 * ARGUMENTOS SIN LA NECESIDAD DE UTILIZAR AYYAYS O LISTAS... EN ESTE MOMENTO ESTOY 
 * UTILIZANDO EL JDK19 
 * 
 * ESPERO DISFRUTEN LA LECTURA Y ENTIENDAN EL CODIGO A CONTINUACION
 * 
 * RECUERDEN SER CURIOSOS Y POR ESTEDES MISMO IR PRIBANDO FUNCIONES METODOS Y DISTINTAS
 * MANERASA DE RESOLVER LOS EJERCICIOS... UNA VEZ RESUELTO EL EJERCICIO MIREN CODIGOS AJENOS
 * PARA VER COMO LO PIENSAN LOS DEMAS Y PODER IR INCORPORANDO LOGICA
 * 
 * @author j0k3r.rg
 */
public class prueba01FuncionesConArgumentosAdamptables {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,2,3,4,5,6,7};
        System.out.println("SUMA CON FUNCION Y VECTORES PARA MULTI PARAMETROS");
        System.out.println(sumaMultiParametricaConVector(nums));
        System.out.println(sumaMultiParametricaConVector(nums2));
        System.out.println(sumaMultiParametricaConVector(nums3));
        System.out.println("\nSUMAS CON FUNCION PARAMETROS ADAPTABLES");
        System.out.println(sumaMultiParametrica(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sumaMultiParametrica(1,2,3,4));
        System.out.println(sumaMultiParametrica(1,2));
    }
    public static int sumaMultiParametrica(int... numeros){
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
    public static int sumaMultiParametricaConVector (int[] numeros){
        int suma=0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
    
}
