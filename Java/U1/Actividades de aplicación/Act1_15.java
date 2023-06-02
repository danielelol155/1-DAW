import java.util.Scanner;

public class Act1_15 {
    public static void main(String[] args) {
        float a, b, c, x, y;


        System.out.print("introduce el valor de la variable a: ");
        Scanner va= new Scanner(System.in);
        a = va.nextFloat();

        System.out.print("introduce el valor de la variable b: ");
        Scanner vb= new Scanner(System.in);
        b = vb.nextFloat();

        System.out.print("introduce el valor de la variable c: ");
        Scanner vc= new Scanner(System.in);
        c = vc.nextFloat();

        System.out.print("introduce el valor de la variable x: ");
        Scanner vx= new Scanner(System.in);
        x = vx.nextFloat();


        y = (a*x*x) + (b*x) + c;
        System.out.print("el valor de y es igual a: "+y);


        va.close();
        vb.close();
        vc.close();
        vx.close();

    }
}
