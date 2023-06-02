import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A12_10
{
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i=0;i<20;i++)
        {
            lista.add((int)(Math.random()*10 +1));
        }

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        

    }
}
