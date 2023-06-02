import java.util.Scanner;

public class Act1_19 {
    public static void main(String[] args) {
        float importe, adultos, niños;
        float impAd=20, impInf=15.50f;

        System.out.print("Introduce la cantidad de adultos: ");
        Scanner ad = new Scanner(System.in);
        adultos= ad.nextFloat();

        System.out.print("Introduce la cantidad de niños: ");
        Scanner ni = new Scanner(System.in);
        niños = ni.nextFloat();


        importe = adultos*impAd;
        importe += niños*impInf;

        if (importe>=100)
        {
            importe-= importe*0.05;
        }

        System.out.println("el importe será "+importe+" €");

        ad.close();
        ni.close();
    }
}
