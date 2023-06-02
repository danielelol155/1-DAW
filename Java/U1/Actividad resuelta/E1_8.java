import java.util.Scanner;

public class E1_8 {
    public static void main(String[] args) {

        int edad;

        System.out.print("Introduce tu edad: ");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        boolean mayor = edad >=18;
        System.out.println("Mayor de edad: "+mayor);

        sc.close();
    }
}
