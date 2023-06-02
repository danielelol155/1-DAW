import java.util.Scanner;

public class pino {
    public static void main(String[] args) {

        int n, fila, col, i;

        System.out.print("introduce el numero de filas:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (fila = 0; fila < n ; fila++)
        {
            for (col = fila; col<(n-1);col++)
            {
                System.out.print(" ");
            }
            for (i = 0; i<= fila; i++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
