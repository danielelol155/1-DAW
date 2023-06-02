import java.util.Scanner;

public class Act1_16
{
    public static void main(String[] args)
    {

        int horas, minutos, segundos;

        System.out.print("introduce una cantidad de segundos: ");
        Scanner sc = new Scanner(System.in);
        segundos = sc.nextInt();

        minutos = segundos/60;
        segundos -= (minutos*60);

        horas = minutos/60;
        minutos -= (horas*60);

        System.out.print("hay un total de "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");

        sc.close();
    }
}
