import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        System.out.println("introduce las palabras separandolas por un espacio.");
        String palab = sc.nextLine();

        String[] palabs = palab.split(" ");

        palabras = Arrays.asList(palabs);


        System.out.println(palabras);

        List<String> nuevo = new ArrayList<>();

        for (String str : palabras) {

            if (!str.contains("a")) {
                nuevo.add(str);

            }
        }
        System.out.println(nuevo);

    }
}
