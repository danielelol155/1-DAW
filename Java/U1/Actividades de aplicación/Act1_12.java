import java.util.Scanner;

public class Act1_12
{
    public static void main(String[] args)
    {
        int num_ent, contador = 0;

        System.out.print("introduce un numero entero: ");
        Scanner ne = new Scanner(System.in);
        num_ent = ne.nextInt();

        while  ((num_ent+contador)%7 != 0)
        {
            contador++;
        }

        System.out.println("para que el numero "+num_ent+" sea múltiplo de 7 hay que sumarle "+contador);

        ne.close();
    }
}
