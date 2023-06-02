import java.util.Scanner;

public class E1_11 {
    public static void main(String[] args) {
        float p_manzanas = 2.35f, p_peras = 1.95f;

        int vManz1, vManz2;
        int vPeras1, vPeras2;
        double impMTot;

        System.out.print("Venta de manzanas en kilos en el 1 semestre: ");
        Scanner a = new Scanner(System.in);
        vManz1 = a.nextInt();

        System.out.print("Venta de manzanas en kilos en el 2 semestre: ");
        Scanner b = new Scanner(System.in);
        vManz2 = b.nextInt();

        System.out.print("Venta de peras en kilos en el 1 semestre: ");
        Scanner c = new Scanner(System.in);
        vPeras1 = c.nextInt();

        System.out.print("Venta de peras en kilos en el 2 semestre: ");
        Scanner d = new Scanner(System.in);
        vPeras2 = d.nextInt();


        impMTot = (vManz1+vManz2)*p_manzanas;
        impMTot += (vPeras1+vPeras2)*p_peras;

        System.out.println("El importe total es de: "+impMTot+" $");


        a.close();
        b.close();
        c.close();
        d.close();
    }
}
