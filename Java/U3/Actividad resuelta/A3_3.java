import java.util.Scanner;

public class A3_3 {
     public static void main(String[] args) {
         int random, numero = 0;

         random = (int)((Math.random() * 100) + 1);

         while ((numero!=random)&&(numero!=-1))
         {
            System.out.print("Introduce el numero que crees que podría ser: ");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();

            if ((numero < random)&&(numero!=-1))
            {
               System.out.println(numero+" es menor que el numero secreto");
            }

            if (numero > random)
            {
               System.out.println(numero+" es mayor que el numero secreto");
            }
            sc.close();
         }

         if (numero==-1)
         {
            System.out.println("te rindes entonces? Desafortunado. Si es así, el numero secreto es: "+random);
         }

         else
         {
            System.out.println("Felicidades, has adivinado el numero secreto");
         }
     }
}
