import java.util.Scanner;

public class Act1_18 {
    public static void main(String[] args) {
        int hormigas, arañas, cochinillas;
        int hpatas=6, apatas=8, cpatas=16, totalpatas=0;

        System.out.print("Introduce la cantidad de hormigas capturadas: ");
        Scanner nh = new Scanner(System.in);
        hormigas = nh.nextInt();

        System.out.print("Introduce la cantidad de arañas capturadas: ");
        Scanner na = new Scanner(System.in);
        arañas= na.nextInt();

        System.out.print("Introduce la cantidad de cochinillas capturadas: ");
        Scanner nc = new Scanner(System.in);
        cochinillas= nc.nextInt();


        totalpatas += hormigas*hpatas;
        totalpatas += arañas*apatas;
        totalpatas+= cochinillas*cpatas;

        System.out.println("el numero total de patas es "+totalpatas);


        nh.close();
        na.close();
        nc.close();
    }
}
