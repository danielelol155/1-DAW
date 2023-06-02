import java.util.Scanner;

public class A4_2 {
    public static void mostrar(int a, int b)
    {
        int mayor = a>b ? a:b;
        int menor = a<b ? a:b;

        int i;
        for (i=menor; i<=mayor;i++)
        {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce 2 numeros enteros diferentes:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("");
        mostrar(a,b);

        sc.close();
    }
}
