import java.util.Arrays;
import java.util.Scanner;

public class E5_11 {

    static void generacomb(int t[])
    {
        int MAX=5;
        for (int i=0;i<t.length;i++)
        {
            t[i] = (int)((Math.random()*MAX)+1);
        }
    }

    static void leertabla(int t[])
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< t.length;i++)
        {
            t[i]= sc.nextInt();
        }

        sc.close();
    }

    static void muestrapista(int secret[], int jug[])
    {
        System.out.println("pistas:");
        for (int i =0;i<jug.length;i++)
        {
            System.out.println(jug[i]);
            if (secret[i]>jug[i])
            {
                System.out.println("mayor");
            }
            else if (secret[i]<jug[i])
            {
                System.out.println("menor");
            }
            else
            {
                System.out.println("igual");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("longitud de la combinacion secreta: ");
        int longitud = sc.nextInt();
        int combsecreta[] = new int[longitud];
        int combjugador[] = new int[longitud];

        generacomb(combsecreta);

        System.out.println("Escribe una combinacion: ");
        leertabla(combjugador);

        int intentos=0;
        boolean flag=true;
        while ((!Arrays.equals(combsecreta, combjugador))&&(intentos<5)&&(flag==true))
        {
            muestrapista(combsecreta,combjugador);
            System.out.println("escriba una combinacion: ");
            leertabla(combjugador);
            intentos++;
            System.out.println("intento restantes: "+(5-intentos));
            System.out.println("¿quieres continuar? (true/false): ");
            flag = sc.nextBoolean();
        }
        if (Arrays.equals(combsecreta, combjugador))
        {
        System.out.println("La camara se ha abrido:");
        }
        else
        {
            System.out.println("has perdido.");
            System.out.println("la combinacion secreta es: "+Arrays.toString(combsecreta));
        }

        sc.close();
    }


}
