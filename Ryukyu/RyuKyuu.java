import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;

public class RyuKyuu {

    public static String[] Crear_Baraja()
    {
        String cartas[] =
        {
            "1\u2665","2\u2665","3\u2665","4\u2665","5\u2665","6\u2665","7\u2665","8\u2665","9\u2665","X\u2665","J\u2665","Q\u2665","K\u2665",
            "1\u2666","2\u2666","3\u2666","4\u2666","5\u2666","6\u2666","7\u2666","8\u2666","9\u2666","X\u2666","J\u2666","Q\u2666","K\u2666",
            "1\u2660","2\u2660","3\u2660","4\u2660","5\u2660","6\u2660","7\u2660","8\u2660","9\u2660","X\u2660","J\u2660","Q\u2660","K\u2660",
            "1\u2663","2\u2663","3\u2663","4\u2663","5\u2663","6\u2663","7\u2663","8\u2663","9\u2663","X\u2663","J\u2663","Q\u2663","K\u2663"
        };
        
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

        String baraja[]= new String[longitud];
        for (int i=0; i<longitud;i++)
        {
            baraja[i] = cartas[orden[i]];
        }

        return baraja;
    }

    public static String[][] crear_mano(String baraja[])
    {
        String mano[][] =  new String[3][4];

        int contador = 0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                mano[i][j]= baraja[contador];
                contador++;
            }
        }

        return mano;
    }

    public static String[] disminuir_Baraja(String t[], int cartas_quitar)
    {
        String new_baraja[] = new String[t.length-cartas_quitar];

        for (int i=0;i<new_baraja.length;i++)
        {
            new_baraja[i]=t[i+cartas_quitar];
        }

        return new_baraja;
    }

    public static String[][] actualizar_Mano(String t[][], int columna, String new_carta)
    {
        String new_Mano[][] = new String[3][4];

        // pasamos a la nueva matriz todos los valores de la matriz original que no cambian.
        for (int col=0; col<4;col++)
        {
            if (col != columna)
            {
                for (int fil = 0; fil<3;fil++)
                {
                    new_Mano[fil][col] = t[fil][col];
                }
            }
        }

        // actualizamos los valores que sí cambian, usando primero un bucle para actualizar los de abajo y luego actualizar manualmente el de arriba
        for (int i=2;i>0;i--)
        {
            new_Mano[i][columna] = t[i-1][columna];
        }
        new_Mano[0][columna] = new_carta;

        return new_Mano;
    }

    public static void mostrar(String t[][])
    {
        for (int i = 0;i<t.length;i++)
        {
            for (int j=0;j<t[0].length;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void juego()
    {
        Scanner sc = new Scanner(System.in);
        String Baraja[] = Crear_Baraja();
        
        // System.out.println(Arrays.toString(Baraja));

        String mano[][] = crear_mano(Baraja);

        // como para crear la mano hemos usado 12 cartas de la baraja, le quitaremos esas mismas cartas a la baraja
        String baraja_aux[] = disminuir_Baraja(Baraja,12);
        Baraja = Arrays.copyOf(baraja_aux, Baraja.length-12);

        // comprobar el funcionamiento de disminuir baraja
/*         System.out.println(Arrays.toString(Baraja));
 */
        String matriz_juego[][] = new String[5][5];
        for (int i=0; i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                matriz_juego[i][j] = "--";
            }
        }

        // mostramos todo al inicio
        mostrar(mano);
        mostrar(matriz_juego);

        boolean parar = false;
        while (parar == false)
        {
            // actualizamos todo.
            System.out.println("elige de la columna de la mano de la que quieres coger cartas (0-3)");
            int col_eleg= sc.nextInt();

            String carta = mano[col_eleg][2];
            mano = actualizar_Mano(mano, col_eleg, Baraja[0]);
            String tabla_aux[] = disminuir_Baraja(Baraja,1);
            Baraja = Arrays.copyOf(tabla_aux, tabla_aux.length);

            // mostramos todo
            mostrar(mano);
            mostrar(matriz_juego);


            parar = sc.nextBoolean();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String resultado[] = new String[0];
        // menu
        // boolean run=menu
        

        boolean flag = true;
        /*      String puntuación;
        String jugador;         */
        do
        {
            System.out.println("jugar: 1");
            System.out.println("mostrar ranking: 2");
            System.out.println("salir: 3");
            int key = sc.nextInt();
            switch (key)
            {
                case 1:
                    
                    juego();

                    // no se que estoy intentando aquí
                    /*
                    puntuación = "10942";

                    System.out.println("introduce el nombre del usuario:");
                    jugador = sc.next();
                    // resultado[partida][0] = jugador+"";
                    // resultado[partida][1] = puntuación;
                    int long_anterior = resultado.length;
                    resultado = Arrays.copyOf(resultado, resultado.length+2);
                    resultado[long_anterior] = jugador;
                    resultado[long_anterior+1] = puntuación; 
                    */
                    
                    break;
    
                case 2:

                    for (int i=0;i<resultado.length-1;i++)
                    {
                        for (int j=0;j<2;j++)
                        {
                            System.out.print(resultado[i]+" ");
                        }
                        System.out.println();
                    }

                    break;
    
                default:

                    flag = false;
                    break;
            }
            System.out.println();
        } while(flag == true);
        
        sc.close();
    }



    // intento de tabla de records
    /*
    public static String[][] records(String tabla_anterior[][], String puntuacion, String nombre)
    {
        String tabla_nueva[][] = new String[tabla_anterior.length+1][2];

        for (int i=0; i<tabla_anterior.length;i++)
        {
            for (int j=0;j<2;j++)
            {
                tabla_nueva[i][j] = tabla_anterior[i][j];
            }
        }
        tabla_nueva[tabla_nueva.length-1][0] = nombre;
        tabla_nueva[tabla_nueva.length-1][1] = puntuacion;
        
        
        return tabla_nueva;
    }
    */
}
