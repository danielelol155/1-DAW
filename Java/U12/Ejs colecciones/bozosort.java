import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bozosort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el tamaño");
        int tamaño = sc.nextInt();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            lista.add((int)(Math.random()*99+1));
        }

        List<Integer> sorted = new ArrayList<>();

        for (int i=0;i<lista.size();i++)
        {
            sorted.add(lista.get(i));
        }




        Collections.sort(sorted);
        System.out.println(lista+" "+sorted);

        int iteraciones=0;
        while (!lista.equals(sorted))
        {
            Collections.shuffle(lista);
            if (!lista.equals(sorted))
            {
                System.out.println("not sorted");
                System.out.println(lista);
            }
            iteraciones++;
        }
        System.out.println(lista);
        System.out.println("en "+iteraciones+ " interaciones");
    }
}
