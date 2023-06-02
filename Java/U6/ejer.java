import java.util.Scanner;

public class ejer {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int numero = sc.nextInt();

        String cad;

        cad = String.valueOf(numero);
        System.out.println(cad);

        sc.close();
    }
}
