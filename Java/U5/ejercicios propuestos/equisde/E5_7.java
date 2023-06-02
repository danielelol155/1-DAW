package equisde;

import java.util.Scanner;

public class E5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce un numero n: ");
        int n = sc.nextInt();

        int[] numeros= new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("introduce el "+(i+1)+"º numero entero: ");
            numeros[i]= sc.nextInt();
        }

        int[] no_rep;



        sc.close();
    }
}
