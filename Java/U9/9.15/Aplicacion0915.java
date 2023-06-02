
import java.util.Scanner;

public class Aplicacion0915 {

    public static void main(String[] args) {
        Supercola c = new Supercola();
        int opcion;
        do {
            System.out.println("1. Encolar en cola1");
            System.out.println("2. Encolar en cola2");
            System.out.println("3. Desencolar de cola1");
            System.out.println("4. Desencolar de cola2");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Introducir opción: ");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor a encolar en cola 1: ");
                    String cad = new Scanner(System.in).nextLine();
                    c.encolarEn1(cad);
                    System.out.println(c);

                }
                case 2 -> {
                    System.out.print("Valor a encolar en cola 2: ");
                    String cad = new Scanner(System.in).nextLine();
                    c.encolarEn2(cad);
                    System.out.println(c);
                }
                case 3 -> {
                    System.out.println("Valor desencolado de cola 1: "
                            + c.desencolarDe1());
                    System.out.println(c);
                }
                case 4 -> {
                    System.out.println("Valor desencolado de cola 2: "
                            + c.desencolarDe2());
                    System.out.println(c);
                }
            }
        } while (opcion != 5);
    }
}
