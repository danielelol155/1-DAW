import java.util.Scanner;

public class E1_6 {
    public static void main(String[] args)
    {
        int nota1, nota2;
        float media, suma;

        System.out.print("escribe la primera nota: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextInt();

        System.out.print("escribe la segunda nota: ");
        Scanner sd = new Scanner(System.in);
        nota2 = sd.nextInt();

        suma = nota1+nota2;

        media = suma/2;
        System.out.println("la nota media es "+media);

        sc.close();
        sd.close();
    }
}
