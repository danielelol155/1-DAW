import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();

        do
        {
            System.out.println("introduce un nombre");

            String nombre = sc.nextLine();

            if (m.containsKey(nombre))
            {
                m.put(nombre, m.get(nombre)+1);
            }
            else
            {
                m.put(nombre, 1);
            }

            System.out.println(m);
        }
        while (true);
    }
}
