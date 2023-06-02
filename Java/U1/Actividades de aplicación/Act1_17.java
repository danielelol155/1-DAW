import java.util.Scanner;

public class Act1_17
{
    public static void main(String[] args)
    {
        float milimetros, centimetros, metros, total=0.0f;

        System.out.print("Introduce una distancia en mm: ");
        Scanner vmm = new Scanner(System.in);
        milimetros = vmm.nextFloat();
        System.out.print("Introduce una distancia en cm: ");
        Scanner vcm = new Scanner(System.in);
        centimetros = vcm.nextFloat();
        System.out.print("Introduce una distancia en m: ");
        Scanner vm = new Scanner(System.in);
        metros = vm.nextFloat();

        total += milimetros/10;
        total += centimetros;
        total += metros*100;

        System.out.println("la distancia total es de "+total+" cm");

        vmm.close();
        vcm.close();
        vm.close();

    }
}
