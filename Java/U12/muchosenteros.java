import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class muchosenteros {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i=0; i<5000000 ; i++)
        {
            lista.add((int)(Math.random()*1000000));
        }

        
    
        Integer mayor = -1;
        for (Integer i: lista)
        {
            if (i>mayor)
            {
                mayor=i;
            }
        }

        lista.add(mayor+1);


        double time_start, time_end;
        time_start = System.nanoTime();

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        
        
        time_end = System.nanoTime();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" nanosecs en ordenar");

        time_start = System.nanoTime();

        int index = Collections.binarySearch(lista, 10);
        time_end = System.nanoTime();
        System.out.println("the task has taken "+ ( time_end - time_start ) +" nanosecs en buscar");
        
    }
}
