import java.util.Scanner;

public class E1_4
{
    public static void main(String[] args)
    {
        int anyo_act, anyo_nacim, edad;

        System.out.print("dime el año actual: ");
        Scanner sc = new Scanner(System.in);

        anyo_act = sc.nextInt();

        System.out.print("dime tu año de nacimiento: ");
        Scanner cs = new Scanner(System.in);

        anyo_nacim = cs.nextInt();

        edad = anyo_act- anyo_nacim;
        System.out.println("tienes "+edad+" años ");

        sc.close();
        cs.close();

    }
}