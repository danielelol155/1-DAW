import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class A12_8 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();

        for (int i=0;i<20;i++)
        {
            lista.add((int)(Math.random()*10 +1));
        }

        System.out.println(lista);
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        Collection<Integer> listaOrdenada = new ArrayList<>();
        listaOrdenada.addAll(Arrays.asList(tabla));
        System.out.println(listaOrdenada);

        Comparator<Integer> ordenDecre = new Comparator<>() {
            public int compare(Integer e1, Integer e2)
            {
                return e2-e1;
            }
        };

        Arrays.sort(tabla, ordenDecre);
        Collection<Integer> listaDecre = new ArrayList<>();
        listaDecre.addAll(Arrays.asList(tabla));
        System.out.println(listaDecre);
    }
}
