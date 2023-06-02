import java.util.Arrays;

public class array_bool_2
{
    public static void main(String[] args) {
        boolean[] array= {true, false, false, true, false, false, true, true, true, false, false, true, false, false, true, true, true, false, false, true, false, false, true, true};
        boolean[] ordenado= new boolean[array.length];

        System.out.println(array.length);

        int j=0;
        int k=0;

        for (int i =0; i<(array.length); i++)
        {
            if (array[i]==false)
            {
                ordenado[k] = array[i];
                k++;
            }
            else
            {
                ordenado[(array.length-1)-j] = array[i];
                j++;
            }
        }

        System.out.print(Arrays.toString(ordenado));
    }
}
