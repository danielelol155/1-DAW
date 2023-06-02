import java.util.Scanner;

public class ejercicio {
    public static void swap(int[]v1,int[] v2)
    {
        int[] swap = new int[2];
        int j=1;
        for (int i=0; i<2;i++)
        {
            swap[i]= v1[j];
            j--;
        }

/*         System.out.print("swap: ");
        for (int i=0; i<2; i++)
        {
            System.out.print(swap[i]+" ");
        }
        System.out.println("");
 */
        j=1;
        for (int i=0; i<2;i++)
        {
            v1[i]= v2[j];
            j--;
        }

        for (int i=0; i<2;i++)
        {
            v2[i]= swap[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = new int[2];
        int[] v2 = new int[2];

        System.out.println("introduce 2 valores enteros para v1:");
        for (int i=0; i<2; i++)
        {
            v1[i] = sc.nextInt();
        }

        System.out.println("introduce 2 valores enteros para v2:");
        for (int i=0; i<2; i++)
        {
            v2[i] = sc.nextInt();
        }


        System.out.print("v1: ");
        for (int i=0; i<2; i++)
        {
            System.out.print(v1[i]+" ");
        }
        System.out.println("");

        System.out.print("v2: ");
        for (int i=0; i<2; i++)
        {
            System.out.print(v2[i]+" ");
        }
        System.out.println("");


        swap(v1,v2);

        System.out.print("v1: ");
        for (int i=0; i<2; i++)
        {
            System.out.print(v1[i]+" ");
        }
        System.out.println("");

        System.out.print("v2: ");
        for (int i=0; i<2; i++)
        {
            System.out.print(v2[i]+" ");
        }
        System.out.println("");



        sc.close();

    }
}
