package Guia03EstructurasDeControl;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, 
 * el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author j0k3r.rg
 */
public class ejercicioExtra01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tiempo en minutos");
        int tiempoMin = leer.nextInt();
        int dias =(int) (tiempoMin / (1440)); //1440 = 24 hs * 60 MIN .... calculamos el total de minutos en un dia
        int minSobrantes = tiempoMin - 1440 * dias;
        int horas = (int) (minSobrantes / 60);
        System.out.println("su equivalente a dias y horas es \nDias: "+dias+"\tHoras: "+horas);
        
        leer.close();
    }
    
}
