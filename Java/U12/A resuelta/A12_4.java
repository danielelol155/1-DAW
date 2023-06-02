import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class A12_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Collection<Integer> numeros = new ArrayList<>();

        System.out.println("introduce un numero entero:");
        Integer n = sc.nextInt();

        while (n>=0)
        {
            numeros.add(n);
            System.out.println("introduce un nuevo entero:");
            n=sc.nextInt();
        }

        System.out.println("E aquí la lista completa:" + numeros);

        System.out.print("esos son los numeros pares: ");

        for (Integer it:numeros)
        {
            if ((it%2)==0)
            {
                // es par
                System.out.print(it + " ");
            }
        }
        System.out.println();

        for (Iterator<Integer> it = numeros.iterator();it.hasNext();)
        {
            n = it.next();
            if ((n%3)==0)
            {
                // es multiplo de 3
                it.remove(); //esto elimina el ultimo valor que ha devuelto next
            }
        }
        System.out.println("lista completa actual: "+ numeros);
    }
}
