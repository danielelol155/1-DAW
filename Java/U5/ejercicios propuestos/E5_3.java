import java.util.Scanner;

public class E5_3
{
    public static void reverse(int[] input)
    {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++){
          int temp = input[i];
          input[i] = input[last - i];
          input[last - i] = temp;
        }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce un numero n: ");
        int n = sc.nextInt();

        int[] numeros= new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("introduce el "+(i+1)+"º numero entero: ");
            numeros[i]= sc.nextInt();
        }

        int cpos=0, cneg=0, ceros=0;
        int pos=0, neg=0;

        int num;
        for (int i=0; i<n;i++)
        {
            num = numeros[i];

            if (num>0)
            {
                cpos++;
                pos+=num;
            }
            if (num<0)
            {
                cneg++;
                neg+=num;
            }
            else
            {
                ceros++;
            }
        }

        if (cpos!=0)
        {
            pos /= cpos;
            System.out.println("La media de los numeros positivos es: "+pos);
        }
        if (cneg!=0)
        {
            neg /= cneg;
            System.out.println("La media de los numeros negativos es: "+neg);
        }

        System.out.println("se han introducido "+ceros+" ceros");

        sc.close();
    }
}