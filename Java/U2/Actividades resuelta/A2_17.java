import java.lang.Math;
import java.util.Scanner;
public class A2_17
{
    public static void main(String[] args)
    {
        int num1 = (int)((Math.random() * 98)+1);
        int num2 = (int)((Math.random() * 98)+1);
        int suma;

        System.out.println("¿cuanto es "+num1+"+"+num2);
        Scanner sc = new Scanner(System.in);
        suma = sc.nextInt();

        if (suma == (num1+num2))
        {
            System.out.println("Correcto");
        }
        else
        {
            System.out.println("Cagaste, la respuesta es "+(num1+num2));
        }
    }
}
