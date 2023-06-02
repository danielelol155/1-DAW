import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Examen {
    public static void main(String[] args) {
        Map<Integer,Integer[]> m = new HashMap<>();
        Integer dorsales[] = {5,48,6,17,2,34,12,21,14,18,9,20,43,19,8,23};

        // introducimos las posiciones de salida
        
        m.put(0,dorsales);
        // System.out.println(m.get(0));
        

        // Apartado A
        for (int i=0; i<20; i++)
        {
            // Mezclamos las posiciones y las introducimos en el mapa con una nueva clave
            Integer[] mezclado = new Integer[dorsales.length];
            List<Integer> mezclador = Arrays.asList(dorsales);
            Collections.shuffle(mezclador);
            mezclador.toArray(mezclado);
            m.put(i+1, mezclado);
        }


        // Apartado B
        Map<Integer,Integer> veces_primero = new HashMap<>();

        // inicializamos el bucle en uno para saltarnos la posición 0 correspondiente a la salida.
        for (int i=1; i<21; i++)
        {
            Integer dorsal=0;

            /* para poder coger la primera posición de cada array, voy a crear un array 
             * y le daré como valor el valor de el array correspondiente a cada vuelta.*/
            Integer a[] = m.get(i);

            dorsal = a[0];

            if (veces_primero.containsKey(dorsal))
            {
                veces_primero.put(dorsal, veces_primero.get(dorsal)+1);
            }
            else
            {
                veces_primero.put(dorsal, 1);
            }
        }
        // mostramos las veces que cada dorsal queda primero.
        System.out.println(veces_primero);

        // sacamos el dorsal ganador
        Integer a[] = m.get(20);
        Integer dorsal = a[0];
        System.out.println("El ganador es el dorsal "+dorsal);

        // buscamos cual es el dorsal que más vueltas ha ganado.
        Integer mayor = 0;
        Integer mayor_valor = 0;
        Set<Map.Entry<Integer,Integer>> entradas = veces_primero.entrySet();
        Iterator<Map.Entry<Integer,Integer>> it;

        for (it = entradas.iterator(); it.hasNext();)
        {
            Map.Entry<Integer,Integer> e = it.next();
            if (e.getValue() > mayor_valor)
            {
                mayor = e.getKey();
                mayor_valor = e.getValue();
            }
        }

        System.out.println("El dorsal que más vueltas ha ganado es "+mayor);
    }
}



/* la salida al inicio no cuenta como paso por linea de meta.
Aun así, para poder ve la posición de salida, en las posiciones añadiremos
como posicion[0] la de salida. Por lo que tendremos que añadir 1 al numero
de vueltas. */

/* no he tenido en cuenta el caso de que haya empate en el dorsal que más vueltas
haya ganado porque no me daría tiempo y no quiero calentarme demasiado la cabeza */