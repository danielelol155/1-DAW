import java.util.Scanner;

public class A3_3 {
    public static void main(String[] args) {
        int numero, resto;
        System.out.print("Introduce un numero natural: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        while (numero>0)
        {
            resto = numero%10;
            System.out.println(resto);
            numero/=10;
        }
        sc.close();
    }
}
