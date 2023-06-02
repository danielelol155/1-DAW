import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConteoPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> M = new HashMap<>();

        System.out.println("introduce la primera y la segunda palabra respectivamente");
        String p1 = sc.next();

        int longit = p1.length();
        boolean flag = true;

        
            for (int i = 0; i<longit ; i++)
            {
                String str = p1;
                if (M.containsKey(str))
                {
                    M.put(str, M.get(str)+1);
                }
                else
                {
                    M.put(str, 1);
                }
            }

            System.out.println(M);
    

        while (true)
        {
            System.out.println("introduce una nueva palabra");

        }

        // System.out.println(flag);
    }
}
