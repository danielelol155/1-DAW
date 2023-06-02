import java.util.Scanner;

public class A2_12_DNI
{
    public static void main(String[] args)
    {
        int dninum, num;
        System.out.print("introduce un numero de 8 digitos: ");
        Scanner sc = new Scanner(System.in);
        dninum = sc.nextInt();


        /* while (dninum>=100000000)||(dninum<=9999999)
        {
            System.out.println("ese no es un numero entero de 8 digitos");
        } */
        num = dninum % 23;
        System.out.println();

        switch (num) {
            case 0 : {System.out.println("La letra correspondiente al número "+dninum+" es t ");}
            case 1 : {System.out.println("La letra correspondiente al número "+dninum+" es r ");}
            case 2 : {System.out.println("La letra correspondiente al número "+dninum+" es w ");}
            case 3 : {System.out.println("La letra correspondiente al número "+dninum+" es a ");}
            case 4 : {System.out.println("La letra correspondiente al número "+dninum+" es g ");}
            case 5 : {System.out.println("La letra correspondiente al número "+dninum+" es m ");}
            case 6 : {System.out.println("La letra correspondiente al número "+dninum+" es y ");}
            case 7 : {System.out.println("La letra correspondiente al número "+dninum+" es f ");}
            case 8 : {System.out.println("La letra correspondiente al número "+dninum+" es p ");}
            case 9 : {System.out.println("La letra correspondiente al número "+dninum+" es d ");}
            case 10 : {System.out.println("La letra correspondiente al número "+dninum+" es x ");}
            case 11 : {System.out.println("La letra correspondiente al número "+dninum+" es b ");}
            case 12 : {System.out.println("La letra correspondiente al número "+dninum+" es n ");}
            case 13 : {System.out.println("La letra correspondiente al número "+dninum+" es j ");}
            case 14 : {System.out.println("La letra correspondiente al número "+dninum+" es z ");}
            case 15 : {System.out.println("La letra correspondiente al número "+dninum+" es s ");}
            case 16 : {System.out.println("La letra correspondiente al número "+dninum+" es q ");}
            case 17 : {System.out.println("La letra correspondiente al número "+dninum+" es v ");}
            case 18 : {System.out.println("La letra correspondiente al número "+dninum+" es h ");}
            case 19 : {System.out.println("La letra correspondiente al número "+dninum+" es l ");}
            case 20 : {System.out.println("La letra correspondiente al número "+dninum+" es c ");}
            case 21 : {System.out.println("La letra correspondiente al número "+dninum+" es k ");}
            case 22 : {System.out.println("La letra correspondiente al número "+dninum+" es e ");}
        }
        sc.close();
        
    }
}
