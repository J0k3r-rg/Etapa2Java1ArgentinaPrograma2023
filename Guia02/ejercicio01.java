/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia02;

import java.util.Scanner;

/**
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 * @author j0k3r.rg
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero 1: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese numero 2: ");
        int num2 = leer.nextInt();
        /*
        otra ocion es
        System.out.println("el resultado de la suma es: "+(num1+num2));
        */
        int suma = num1 + num2;
        System.out.println("el resultado de la suma es: "+suma);
        
        leer.close();
    }
    
}
