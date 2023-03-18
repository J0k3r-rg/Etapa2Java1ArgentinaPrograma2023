package Guia00PruebasMias;
/**
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
