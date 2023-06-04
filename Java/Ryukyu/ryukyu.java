import java.util.Arrays;
// import java.util.Scanner;
import java.lang.System;

public class ryukyu
{
    // con esta función randomizaremos el orden de las cartas de la baraja de
    // manera que no se repita ninguna carta y la pasaremos como una nueva tabla.
    public static String[] randomizar_orden(String cartas[])
    {
        int longitud = cartas.length;

        int orden[]= new int[1];
        int contador=0;
        orden[contador] = (int)(Math.random()*(longitud));

        contador++;
        while (contador < longitud)
        {
            // creamos un centinela para asegurarnos que no se repitan las posiciones
            // y lo actualizamos a true cada vez que se repita el bucle principal.
            boolean flag = true;
            int num_random = (int)(Math.random()*(longitud));
            for (int i=0; i<orden.length;i++)
            {
                if (num_random==orden[i])
                {
                    flag = false;
                }
            }
            if (flag==true)
            {
                orden = Arrays.copyOf(orden, orden.length+1);
                orden[contador] = num_random;
                contador++;
            }
        }
        // el comentario de abajo es pa comprobar que ser randomize bien.
        /*System.out.println(Arrays.toString(orden));
        int check[] = Arrays.copyOf(orden, longitud);
        Arrays.sort(check);
        System.out.println(Arrays.toString(check)); */

        String baraja_random[]= new String[longitud];
        for (int i=0; i<longitud;i++)
        {
            baraja_random[i] = cartas[orden[i]];
        }

        return baraja_random;
    }

    /* public static String[][] generar_mano(String baraja[])
    {
        String mano[][] = new String[13][4];

        int contador=0;
        for (int i = 0;i<13;i++)
        {
            for (int j=0;j<4;j++)
            {
                mano[i][j]=baraja[contador];
                contador++;
            }
        }
        return mano;
    } */

    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // este será el array donde pondremos las cartas.
        String cartas[] =
        {
            "1\u2665","2\u2665","3\u2665","4\u2665","5\u2665","6\u2665","7\u2665","8\u2665","9\u2665","10\u2665","11\u2665","12\u2665","13\u2665",
            "1\u2666","2\u2666","3\u2666","4\u2666","5\u2666","6\u2666","7\u2666","8\u2666","9\u2666","10\u2666","11\u2666","12\u2666","13\u2666",
            "1\u2660","2\u2660","3\u2660","4\u2660","5\u2660","6\u2660","7\u2660","8\u2660","9\u2660","10\u2660","11\u2660","\u2660","\u2660",
            "1\u2663","2\u2663","3\u2663","4\u2663","5\u2663","6\u2663","7\u2663","8\u2663","9\u2663","10\u2663","11\u2663","12\u2663","13\u2663"
        };
        String Baraja[] = randomizar_orden(cartas);

        System.out.println(Arrays.toString(Baraja));

        // menu
        // boolean run=menu
        System.out.println("jugar: 1");
        System.out.println("mostrar ranking: 2");
        System.out.println("salir: 3");
        // int key = sc.nextInt();

        /* switch (key) {
            case 1:

                break;

            default:
                break;
        } */

        // String Mano[][] = generar_mano(Baraja);

        // comprobar que funcione
        for (int i = 0;i<13;i++)
        {
            for (int j=0;j<4;j++)
            {
                // System.out.print(Mano[i][j]+ " ");
            }
            System.out.println();
        }


    }
}