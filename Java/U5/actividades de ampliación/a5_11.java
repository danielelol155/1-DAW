import java.util.Arrays;
import java.util.Scanner;

public class a5_11 {
    public static int[] buscarTodos(int t[], int clave)
    {
        int resul[]= new int[0];

        int j=0;
        for (int i=0; i<t.length;i++)
        {
            int cont= t[i];
            if (cont==clave)
            {
                resul = Arrays.copyOf(resul, resul.length+1);
                resul[j]=i;
                j++;
            }
        }
        return resul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introducir tamaño de la variable: ");
        int tamaño = sc.nextInt();
        int t[]=new int[tamaño];

        System.out.println("introduce los elementos enteros de la tabla:");
        for (int i=0;i<t.length;i++)
        {
            t[i]=sc.nextInt();
        }

        System.out.print("introduce la clave: ");
        int clave = sc.nextInt();

        int resul[]= buscarTodos(t, clave);

        System.out.println(Arrays.toString(resul));

        sc.close();
    }
}
