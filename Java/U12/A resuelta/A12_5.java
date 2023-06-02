import java.util.ArrayList;
import java.util.Collection;

public class A12_5 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();

        for (int i=0;i<20;i++)
        {
            lista.add((int)(Math.random()*10 +1));
        }

        
    }
}
