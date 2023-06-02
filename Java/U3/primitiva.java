package U3;
public class primitiva {
    public static void main(String[] args) {
        int contador=0, num;
        int numeros[];

        // generamos 6 numeros del 1 al 49

        numeros = new int[6];
        num = (int)((Math.random() * 49)+1);
        numeros[contador] = num;

        boolean flag= true;
        while (contador < 5)
        {
            num = (int)((Math.random() * 49)+1);

            for (int i=0; i<contador; i++)
            {

                if (num == numeros[i])
                {
                    flag = false;
                }
            }

            if (flag!=false)
            {
                contador++;
                numeros[contador] = num;
            }
        }
        for (int i=0; i<6; i++)
        {
            System.out.print(numeros[i]+" ");
        }
    }
}
