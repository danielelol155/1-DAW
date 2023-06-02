import java.util.List;
import java.util.ArrayList;

public class E03 {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<Integer>();
        List<Integer> numeros2 = new ArrayList<Integer>();

        int tamaño=10000;

        // generamos los numeros de la lista 1
        for (int i=0 ; i<tamaño ; i++)
        {
            numeros1.add((int)(Math.random()*100));
        }
        System.out.println("numeros 1 ");
        System.out.println(numeros1);


        for (int i=0 ; i<tamaño ; i++)
        {
            numeros2.add((int)(Math.random()*100));
        }
        System.out.println("numeros 2 ");
        System.out.println(numeros2);


        // creamos la nueva lista
        List<Integer> numeros3 = new ArrayList<Integer>();

        // comprobamos a
        for (int i=0 ; i<tamaño ; i++)
        {
            int mayor;
            if (numeros1.get(i) > numeros2.get(i))
            {
                numeros3.add(numeros1.get(i));
            }
            else
            {
                numeros3.add(numeros2.get(i));
            }
        }
        System.out.println("numeros mayores ");
        System.out.println(numeros3);

    }
}