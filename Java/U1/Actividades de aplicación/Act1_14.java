import java.util.Scanner;

public class Act1_14
{
    public static void main(String[] args)
    {
        float base, altura, area_triangulo;

        System.out.print("Introduce la base del triangulo: ");
        Scanner bs = new Scanner(System.in);
        base = bs.nextFloat();

        System.out.print("Introduce la altura del triangulo: ");
        Scanner alt = new Scanner(System.in);
        altura = alt.nextFloat();

        area_triangulo = (float)((base*altura)/2.0);

        System.out.println("el area de el triángulo es "+area_triangulo);


        bs.close();
        alt.close();
    }
}
