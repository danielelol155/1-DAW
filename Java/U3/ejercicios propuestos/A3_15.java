import java.util.Scanner;

public class A3_15 {
    public static void main(String[] args) {
        int longitud, i, j;

        System.out.print("introduce la longitud del triangulo: ");
        Scanner sc = new Scanner(System.in);
        longitud = sc.nextInt();


        // base abajo
        for (i = 1; i<=(longitud-1); i++)
        {
            for (j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // base arriba
        for (i = 1; i<=longitud; i++)
        {
            for (j = i; j<=longitud; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        

        sc.close();
    }
}