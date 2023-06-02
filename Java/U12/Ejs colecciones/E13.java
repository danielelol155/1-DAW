import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class E13 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        int contador = 0;
        while (contador<50) {

            int random = (int)(Math.random()*100 +1);

            if (!(numeros.contains(random)))
            {
                numeros.add(random);
                contador++;
            }

        }
        System.out.println(numeros+"\n");
        System.out.println(numeros.size());

        List<Integer> restantes = new ArrayList<>();

        for (int i = 1; i <= 100; i++)
        {
            if(!(numeros.contains(i)))
            {
                restantes.add(i);
            }
        }

        System.out.println(restantes+"\n"+restantes.size());
    }
}
