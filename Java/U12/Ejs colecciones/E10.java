import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class E10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0;i<500; i++)
        {
            numeros.add((int)(Math.random()*50+1));
        }
        System.out.println(numeros);
        Set<Integer> sinRepes = new HashSet<>(numeros);
        System.out.println(sinRepes);
    }
}
