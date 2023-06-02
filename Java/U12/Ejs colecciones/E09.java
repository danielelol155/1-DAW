import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class E09 {
    public static void main(String[] args) {
        List<Integer> al20 = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
        {
            al20.add(i);
        }
        
        ListIterator<Integer> itr = al20.listIterator(al20.size());

        List<Integer> reves = new ArrayList<>();
        while (itr.hasPrevious())
        {
            reves.add(itr.previous());
        }
        System.out.println(reves);
    }
}
