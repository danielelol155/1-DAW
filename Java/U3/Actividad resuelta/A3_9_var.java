import java.util.Scanner;

public class A3_9_var {
    public static void main(String[] args) {
        int num, i, j;

        System.out.print("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        num = (sc.nextInt())-1;

        for (i = 1; i <=3;i++)
        {
            System.out.println("La tabla de multiplicar del "+num+" es:");
            for (j = 1; j <= 10; j++)
            {
                System.out.println(num+"*"+j+"="+(num*j));
            }

            if (i<3)
            {
                num++;
            }
        }
    }
}
