import java.util.Arrays;

public class array_bool_1 {
    public static void main(String[] args) {
        Boolean[] array= {true, false, false, true, false, false, true, true, true, false, false, true, false, false, true, true, true, false, false, true, false, false, true, true};
        int[] tobinario = new int[array.length];

        for (int i = 0; i<array.length; i++)
        {
            if (array[i]==false)
            {
                tobinario[i] = 0;
            }
            else
            {
                tobinario[i] = 1;
            }
        }
        Arrays.sort(tobinario);

        for (int i = 0; i<array.length; i++)
        {
            if (tobinario[i]==0)
            {
                array[i] = false;
            }
            else
            {
                array[i] = true;
            }
        }

        for (int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
