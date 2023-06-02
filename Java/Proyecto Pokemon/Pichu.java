public class Pichu {
    String entrenador;
    int Exp;
    int Salud;

    Pichu()
    {
        Exp = 0;
        Salud=20;
    }


    int ataqueRapido()
    {
        int daño=10;

        int random = (int)(Math.random()*2);
        if (random == 1)
        {
            daño*=2;
        }


        return daño;
    }
}
