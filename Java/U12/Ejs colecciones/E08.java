import java.util.ArrayList;
import java.util.List;

public class E08 {
    public static void main(String[] args) {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        
        for (int i = 1; i<100; i+=2)
        {
            impares.add(i);
        }
        
        for (int i = 2; i<=100; i+=2)
        {
            pares.add(i);
        }

        impares.addAll(pares);
        // impares.sort(null);
        // System.out.println(impares);

        for (int i= 1;i<101;i++)
        {
            if (!impares.contains(i))
            {
                System.out.println("false");
            }
        }
    }
}
