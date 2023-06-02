import java.util.Scanner;

public class A4_3 {
    public static double volumen(double rad, double al)
    {
        double resul;

        resul = Math.PI * Math.pow(rad, 2) * al;
        return resul;
    }

    public static double area(double rad, double al)
    {
        double resul;

        resul = Math.PI * rad * (al + rad);
        return resul;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base y la altura del cilindro respectivamente:");
        double radio = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.print("introduce 0 para calcular el area o 1 para el volumen: ");
        int def_caso = sc.nextInt();

        double resul;
        if (def_caso == 0)
        {
            resul = area(radio, altura);
            System.out.println("el volumen del cilindro es: "+resul);
        }
        if (def_caso ==1)
        {
            resul = volumen(radio, altura);
            System.out.println("el volumen del cilindro es: "+resul);
        }
        sc.close();
    }
}
