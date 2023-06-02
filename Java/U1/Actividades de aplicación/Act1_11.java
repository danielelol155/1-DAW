import java.util.Scanner;

public class Act1_11{
    public static void main(String[] args) {
        float base, IVA, iva_base, total;

        System.out.print("introduce la base imponible: ");
        Scanner bs = new Scanner(System.in);
        base = bs.nextFloat();

        System.out.print("introduce el IVA a aplicar: ");
        Scanner iv = new Scanner(System.in);
        IVA = iv.nextFloat();

        iva_base = base*(IVA/100);

        System.out.println("el importe correspondiente al IVA es "+iva_base+" euros");

        total = base + iva_base;

        System.out.println("el precio total es de "+total+" euros");

        bs.close();
        iv.close();
    }
}