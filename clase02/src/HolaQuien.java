import java.util.Scanner;

public class HolaQuien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " +nombre);

        sc.close();

    }
    
}

