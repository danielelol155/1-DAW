import java.util.Scanner;

public class E1_7
{
    public static void main(String[] args)
    {
        double radio, pi, logitud, area;
        pi = 3.14159265359f;;

        System.out.print("Introduce radio: ");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextDouble();

        logitud = 2*pi*radio;
        area = pi*radio*radio;

        System.out.println("La longitud de la circunferencia es "+logitud);
        System.out.println("El area de la circunferencia es "+ area);

        sc.close();
    }
}
