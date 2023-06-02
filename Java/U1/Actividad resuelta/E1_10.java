import java.util.Scanner;

public class E1_10 {
    public static void main(String[] args) {

        Boolean llueve, debereshechos, biblio;

        System.out.print("Llueve?(true/false): ");
        Scanner sc = new Scanner(System.in);
        llueve = sc.nextBoolean();

        System.out.print("Has hecho los deberes?(true/false): ");
        Scanner sd = new Scanner(System.in);
        debereshechos = sd.nextBoolean();

        System.out.print("Necesitas ir a la biblioteca?(true/false): ");
        Scanner se = new Scanner(System.in);
        biblio = se.nextBoolean();


        Boolean sales = !llueve && debereshechos || biblio;
        System.out.println("Puedes salir: "+sales);

        sc.close();
        sd.close();
        se.close();
    }
}
