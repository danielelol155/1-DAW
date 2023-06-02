import java.util.Scanner;
import java.lang.Math;

public class Act1_20 {
    public static void main(String[] args)
    {
        double num, raiz;

        System.out.print("Introduce un  numero real:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        raiz = Math.sqrt(num);

        System.out.println("la raiz cuadrada de "+num+" es "+raiz);

        sc.close();
    }
}
