import java.util.ArrayList;
import java.util.List;

public class E05 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            lista.add((int)(Math.random()*100));
        }

        int longitud = lista.size()-1;

        while (longitud>0)
        {
            Boolean flag = false;
            for (int i=0;i<longitud;i++)
            {
                if(lista.get(i)>lista.get(i+1))
                {
                    int aux = lista.get(i);
                    lista.set(i, lista.get(i+1));
                    lista.set(i+1, aux);

                    flag = true;
                }
            }
            if(flag == false)
            {
                break;
            }
            System.out.println("\n"+lista);

            longitud--;
        }
    }
}
