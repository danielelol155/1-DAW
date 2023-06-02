import java.util.Scanner;

public class a5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][]= new int[4][4];
        System.out.println("introduce los valores ENTEROS de una matriz 4x4:");

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                matriz[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
