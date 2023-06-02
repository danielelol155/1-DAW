public class matriz {
    public static void main(String[] args) {
        int FILAS=3, COLUMNAS=2;
        int v[][];

        v = new int[FILAS][COLUMNAS];

        v[2][1]=8;

        for (int i=0;i<FILAS;i++)
        {
            for (int j=0; j<COLUMNAS; j++)
            {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
