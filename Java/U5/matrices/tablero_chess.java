import java.util.Scanner;
import java.lang.System;

public class tablero_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas=8, columnas=8;
        char tablero_chess[][]= new char[filas][columnas];

        char blancas= '1';
        char negras= '0';

        for (int i=0;i<filas;i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((i+j)%2 == 0)
                {
                    tablero_chess[i][j]=(char)(blancas);
                }
                else{
                    tablero_chess[i][j]= (char)(negras);
                }
            }
        }
        System.out.println();
        for (int i=0;i<filas;i++)
        {
            for (int j=0; j<columnas; j++)
            {
                System.out.print(tablero_chess[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
