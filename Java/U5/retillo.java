public class retillo {
    public static void main(String[] args) {
        int miMazo[] = new int[5];
        int opponentMazo[] = new int[5];

        for (int i=0;i<5;i++)
        {
            int n_random= (int)(Math.random()*9);
            miMazo[i] = n_random;
        }
        for (int i=0;i<5;i++)
        {
            int n_random= (int)(Math.random()*9);
            opponentMazo[i] = n_random;
        }

        int mi_max=0;

        int mayor= miMazo[0];
        for (int i=0;i<5;i++)
        {
            if (mayor<miMazo[i])
            {
                mayor = miMazo[i];
            }
        }
        
        mi_max+= (mayor*10);
    }
}
