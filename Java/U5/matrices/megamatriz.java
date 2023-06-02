public class megamatriz {
    public static void MostrarMatriz(int t[][])
    {
        int filas= t.length;
        int cols = t[0].length;


        for (int i=0;i<filas;i++)
        {
            for (int j=0; j<cols; j++)
            {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int filas = 10;
        int cols = 74;

        int matriz[][] = new int[filas][cols];
        
        for (int i=0;i<filas;i++)
        {
            for (int j=0;j<cols;j++)
            {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
        MostrarMatriz(matriz);

    }
}
