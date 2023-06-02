import java.util.Scanner;

public class A4_1
{
    public static void eco(int n)
    {
        int i;
        for (i=0; i<=n; i++)
        {
            System.out.println("Eco...");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        eco(n);

        sc.close();
    }
}