import java.util.Scanner;

public class Act1_11_mod{
    public static void main(String[] args) {
        float base, descuento, IVA, total, total_desc;

        System.out.print("introduce la base imponible: ");
        Scanner bs = new Scanner(System.in);
        base = bs.nextFloat();


        System.out.print("introduce el IVA a aplicar: ");
        Scanner iv = new Scanner(System.in);
        IVA = iv.nextFloat();


        // Calculamos PVP sin descuento
        total = base + base*(IVA/100);

        System.out.println("el precio total es de "+total+" euros");


        // ahora calculo PVP cuando añadimos el descuento
        System.out.print("introduce el descuento a aplicar: ");
        Scanner ds = new Scanner(System.in);
        descuento = ds.nextFloat();

        total_desc = base - (base * (descuento/100));
        total_desc += (total_desc * (descuento/100));

        System.out.println((total_desc/total)*100);

        ds.close();
        bs.close();
        iv.close();
    }
}
