import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nascar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el porcentaje de probabilidad de que un coche sufra un infortunio en una carrera");
        System.out.println("introduce un double");
        double prob = sc.nextDouble();
        Integer dorsales[] = {5,48,6,17,2,34,12,21,14,18,9,20,43,19,8,23};

        List<Integer> dorsalesActivos = Arrays.asList(dorsales);

        Map<Integer, Integer> vuelta = new TreeMap<>(); //mapa de <posición, dorsal>
        Map<Integer, Integer> pasoPorMeta = new TreeMap<>(); //mapa de <dorsal,veces_primero>

        List<TreeMap<Integer, Integer>> carrera = new ArrayList<>(); //aquí almacenaremos las vueltas

        //20 vueltas más la parrilla de salida (vuelta 0)
        for (int i=0; i<21; i++)
        {
            vuelta.clear();

            //calculamos que dorsales se van fuera en esta vuelta
            for(int j=0;j<dorsales.length;j++)
            {
                int random = (int)(Math.random()*100+1);

                if (random <= prob)
                {
                    dorsalesActivos.remove(j);
                }
            }
            dorsalesActivos.toArray(dorsales);
            System.out.println(dorsalesActivos);
           
            //metemos los dorsales en una nueva vuelta
            for(int j=0; j<dorsales.length; j++)
            {
                vuelta.put(j+1, dorsales[j]); //ojo!! hay que coger los dorsales de dorsalesActivos

            }
            System.out.println("corredores activos: ");
            carrera.add((TreeMap<Integer, Integer>) vuelta);

            //actualizamos los valores de los primeros por meta   
            int dorsalPrimero = vuelta.get(1);

            if(pasoPorMeta.containsKey(dorsalPrimero))
            {
                pasoPorMeta.put(dorsalPrimero, pasoPorMeta.get(dorsalPrimero)+1); //actualizamos el valor
            }
            else
            {
                pasoPorMeta.put(dorsalPrimero, 1); //primera vez que va primero
            }

            //desordenamos los dorsales que quedan en carrera
            Collections.shuffle(dorsalesActivos);
            
            System.out.print("VUELTA " + i + ": ");
            System.out.println(vuelta);
        }

        System.out.println();

        System.out.println("Ganador:");
        System.out.println(carrera.get(carrera.size()-1).get(1));

        System.out.println("Coches que más veces han pasado primeros:");
        int max = Collections.max(pasoPorMeta.values());

        for(Map.Entry<Integer, Integer> entrada: pasoPorMeta.entrySet())
        {
            if(entrada.getValue().equals(Integer.valueOf(max)))
            {
                System.out.print(entrada.getKey()+"="+entrada.getValue()+"  ");
            }
        }



    }

}