import java.util.Scanner;

public class E1_3
{
    public static void main(String[] args)
    {
        int edad;

        System.out.print("Escriba su edad:");
        Scanner sc = new Scanner(System.in);

        edad = sc.nextInt ();
        edad +=1;

        System.out.println("el próximo año su edad será: " + edad + " años.");

        sc.close();
    }
}
