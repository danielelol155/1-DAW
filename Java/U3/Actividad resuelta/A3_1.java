import java.util.Scanner;

public class A3_1 {
    public static void main(String[] args) {
        int edad, max, min;


        System.out.println("introduce la edad máxima");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        max = edad;
        min = edad;

        while (edad!=-1)
        {
            System.out.println("introduce la edad mínima");
            Scanner cs = new Scanner(System.in);
            edad = cs.nextInt();

            if (edad >= max)
            {
                max = edad;
            }
            if ((edad <= min) && (edad !=-1))
            {
                min = edad;
            }

            System.out.println("la edad máxima es de "+max+" y la mínima "+min);
            cs.close();
        }
        sc.close();


    }
}
