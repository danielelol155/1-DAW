public class Tabla_de_multiplicar {
    public static void main(String[] args) {
        int num=1, i, j;

        for (i = 1; i <=10;i++)
        {
            System.out.println("La tabla de multiplicar del "+num+" es:");
            for (j = 1; j <= 10; j++)
            {
                System.out.println(num+"*"+j+"="+(num*j));
            }

            if (i<10)
            {
                System.out.println("");
                num++;
            }
        }
    }
}
