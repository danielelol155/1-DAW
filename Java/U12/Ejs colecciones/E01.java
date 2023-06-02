import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class E01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i=0 ; i<100 ; i++)
        {
            numeros.add(i+1);
        }

        ListIterator<Integer> itr = numeros.listIterator(numeros.size());
        while (itr.hasPrevious())
        {
            System.out.println();
        }
    }
}
