import java.util.Scanner;

public class nose {
    public static double factorial(double x)
    {
        double store_fact = 1;
        int i =1;
        while(i <= x)
        {
          store_fact = store_fact*i;
          i++;
        }
      return store_fact;
    }

    public static boolean comprobarEdad(int edad)
    {
        boolean flag = true;
        if (edad <= 18 || edad >= 110 || edad%2==0)
        {
            flag = false;
        }
        else
        {
            double resul = factorial(edad);

            System.out.print(resul+ " ");
            if (resul>130||edad*2>resul)
            {
                flag = false;
            }
        }

        return flag;
    }
    public static void main(String[] args)
    {
        int edad;

        for (edad=0 ; edad<=120; edad++)
        {
            if (comprobarEdad(edad) == true)
            {
                System.out.println("la edad "+edad+" cumple los requisitos");
            }
            else
            {
                System.out.println("la edad "+edad+" no cumple los requisitos");
            }
        }
    }
}
