import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> M = new HashMap<>();

        System.out.println("introduce la primera y la segunda palabra respectivamente");
        String p1 = sc.next(), p2 = sc.next();

        int longit = p1.length();
        boolean flag = true;

        if (p1.length()==p2.length())
        {
            for (int i = 0; i<longit ; i++)
            {
                Character carac = p1.charAt(i);
                if (M.containsKey(carac))
                {
                    M.put(carac, M.get(carac)+1);
                }
                else
                {
                    M.put(carac, 1);
                }
            }

            System.out.println(M);

            for (int i=0; i<longit;i++)
            {
                Character carac = p2.charAt(i);
                if(M.containsKey(carac))
                {
                    M.put(carac, M.get(carac)-1);

                    if(M.get(carac) ==0)
                    {
                        M.remove(carac);
                    }

                }
                else
                {
                    flag = false;
                    break;
                }
            }
        
        }
        else
        {
            flag = false;
        }

        System.out.println(flag);
    }
}
