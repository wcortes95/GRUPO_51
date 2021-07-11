/*Escribe un programa java que lea una variable de tipo entero y asígnale un valor
A continuación muestra un mensaje indicando si la variable es par o impar
Utiliza el operador condicional para resolverlo*/


import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número entero ");
        numero = sc.nextInt();

        System.out.println(numero + (numero%2==0 ? " es par " : " es impar "));

        sc.close();
    }
}
