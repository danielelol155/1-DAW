import java.util.Arrays;

public class a5_17 {
    public static int[] suma(int t[], int numElementos)
    {
        int resul[] = new int[0];

        int contador= 0;
        int counter=0;
        while (contador<t.length)
        {
            int suma=0;
            for (int i=0;i<numElementos;i++)
            {
                suma+= t[contador];
                contador++;
                if (contador==t.length)
                {
                    break;
                }
            }
            resul= Arrays.copyOf(resul, resul.length+1);
            resul[counter]= suma;
            counter++;
        }

        return resul;
    }
    public static void main(String[] args) {
        int tabla[] = {1,2,3,4,5,6,7,8,9,10};
        int grupos = 1;

        int resul[]= suma(tabla, grupos);
        System.out.println(Arrays.toString(resul));
    }
}
