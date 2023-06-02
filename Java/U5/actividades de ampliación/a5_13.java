import java.util.Arrays;
import java.util.Scanner;

public class a5_13 {
    public static int[] desordenar(int t[])
    {
        int tamaño = t.length;
        int orden[] = new int[tamaño];
        int copia[] = new int[tamaño];

        orden[0]= (int)(Math.random()*tamaño);
        int contador=1;
        boolean flag= true;
        while (contador<tamaño)
        {
            int num_al= (int)(Math.random()*tamaño);

            for (int i=0;i<contador;i++)
            {
                if (num_al==orden[i])
                {
                    flag = false;
                }
            }
            if (flag == true)
            {
                orden[contador]=num_al;
                contador++;
            }
            flag=true;
        }

        for (int i=0;i<tamaño;i++)
        {
            copia[i]= t[orden[i]];
        }
        System.out.println(Arrays.toString(copia));

        return copia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la tabla");
        int tamaño = sc.nextInt();

        int array[]= new int[tamaño];

        System.out.println("introduce los valores enteros de la tabla: ");
        for (int i=0;i<tamaño;i++)
        {
            array[i]=sc.nextInt();
        }
        int resul[] = desordenar(array);

        System.out.println(Arrays.toString(resul));

        sc.close();
    }
}
