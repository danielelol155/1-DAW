import java.util.Scanner;
public  class A2_1
{
    public static void main(String[] args)
    {
        int opción;

        System.out.println("introduce una opción:");
        System.out.println("1) seguir");
        System.out.println("2) abortar");
        System.out.println("3) ayuda");
        System.out.println("4) salir cordialmente");

        Scanner sc = new Scanner(System.in);
        opción = sc.nextInt();


        switch (opción) {
            case 1:
                System.out.println("continuamos");
                break;
            case 2:
                System.out.println("abortar, abortar");
                break;
            case 3:
                System.out.println("mandando ayuda");
                break;
            case 4:
                System.out.println("desea salir?");
                break;

            default:
                System.out.println("lo siento, no conozco que opción habla usted.");
                break;
        }

        sc.close();
    }
}
