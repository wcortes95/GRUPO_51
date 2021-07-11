/*Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit La fórmula es F 32 9 C 5*/

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gradosC, gradosF;
        System.out.println("Introduce grados centigrados ");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + "°C son " + gradosF + "°F");
        
        sc.close();
    }

    

}
