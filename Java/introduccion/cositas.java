import java.util.Scanner;

public class cositas
{
    public static void main(String[] args)
    {
        System.out.println("introduce texto");
        Scanner frase = new Scanner(System.in);

        int var;
        String str;

        str = frase.nextLine();

        var = str.length();
        System.out.println("la longitud de "+str+" es "+var);
        System.out.println( );

        frase.close();

    }
}

