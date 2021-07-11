/*Programa que lea dos variables enteras N y m y le quite a N sus m últimas
cifras*/

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, m;
        
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca valor de m: ");
        m = sc.nextInt();
        
        N = N / (int)Math.pow(10,m); //Math.pow devuelve un número de tipo double
                                     //es necesario convertirlo a int para hacer la                               
                                     //división entre enteros
        System.out.println("Número modificado " + N);

        sc.close();
    }
    
}
