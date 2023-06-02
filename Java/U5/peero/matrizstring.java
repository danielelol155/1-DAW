package peero;
import java.util.Arrays;

public class matrizstring
{
    public static void main(String[] args) {
        String matriz[][] = new String[2][2];
        // String Baraja[] = {"1c","2c","3c","4c","5c","6c","7c","8c","9c","10c","11c","12c","13c",};

        char palo[] = new char [2];
        palo [0] = '1';
        palo [1] = 'P';
        
        String palos;
        palos = String.valueOf(palo);

        for (int i=0; i<matriz.length; i++)
        {
            for (int j=0;j<matriz.length;j++)
            {
                matriz[i][j] = palos;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        for (int j=0;j<matriz.length;j++)
            {
                System.out.println(Arrays.toString(matriz[j]));
            }
    }
}
