import java.util.Scanner;

public class Act1_13
{
    public static void main(String[] args)
    {
        int n, m, contador = 0;

        System.out.print("introduce un numero entero para n: ");
        Scanner nn = new Scanner(System.in);
        n = nn.nextInt();

        System.out.print("introduce un numero entero para m: ");
        Scanner nm = new Scanner(System.in);
        m = nm.nextInt();

        while  ((n+contador)%m != 0)
        {
            contador++;
        }

        System.out.println("para que el numero "+n+" sea múltiplo de "+m+" hay que sumarle "+contador);

        nn.close();
        nm.close();
    }
}
