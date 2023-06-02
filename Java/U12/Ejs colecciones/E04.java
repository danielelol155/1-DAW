import java.util.ArrayList;
import java.util.List;

public class E04 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int tamaño = 20;

        for (int i=0;i<tamaño;i++)
        {
            numeros.add((int)(Math.random()*10+1));
        }
        System.out.println(numeros);

        List<Integer> resul = new ArrayList<>();
        for (int i=0;i<tamaño;i++)
        {
            for (int j=0;j<numeros.get(i);j++)
            {
                resul.add(numeros.get(i));
            }
        }
        System.out.println(resul+"\n");

        List<Integer> reverse = new ArrayList<>();
        
        for (int i=resul.size()-1;i>=0;i--)
        {
            reverse.add(resul.get(i));
        }
        System.out.println(reverse);
    }
}
