import java.util.Scanner;

public class E1_9 {
    public static void main(String[] args) {

        int numero;

        System.out.print("Introduce un numero entero: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        Boolean par = numero%2 == 0;

        System.out.println("numero par: "+par);

        sc.close();
    }
}
