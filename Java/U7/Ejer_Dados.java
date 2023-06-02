
import java.util.Arrays;
import java.util.Scanner;

class Dado
{
    // ESTADO
    int nCaras; //canttidad de caras que quiero que tenga el dado.
    // INTERFAZ

    //constructor
    Dado() //por defecto
    {
        nCaras = 6;
    }

    Dado(int nCaras)
    {
        if(nCaras <2)
        {
        this.nCaras = 2;
        }
        else
        {
            this.nCaras = nCaras;
        }
    }

        //getters
    int getnCaras()
    {
        return nCaras;
    }

    int lanzar()
    {
        int result = (int)((Math.random()*nCaras)+1);
        return result;
    }

    //setters
    void setnCaras(int valor)
    {
        nCaras = valor;
    }
}

public class Ejer_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Dado vectordados[];


        System.out.println("cuantos dados quieres tirar:");
        int ndados = sc.nextInt();
        vectordados = new Dado[ndados];

        for (int i=0;i<ndados;  i++)
        {
            System.out.println("tamaño del dado "+(i+1));
            // int caras = sc.nextInt();
            int caras = 98;
            vectordados[i]= new Dado(caras);
        }
    
        int tiradas[]= new int[ndados];
        for (int i=0;i<ndados;i++)
        {
            tiradas[i]= vectordados[i].lanzar();
        }
        System.out.println(Arrays.toString(tiradas));


        /* // como el vectordados se inicializa como nulo, inicializaré todos los valores a 0.
        for (int i=0;i<ndados;i++)
        {
            vectordados[i].setnCaras(0);
        }

        for (int i=0;i<ndados;i++)
        {
            System.out.println("tamaño del dado "+(i+1));
            int caras = sc.nextInt();
            vectordados[i].setnCaras(caras);
        }

        int tiradas[] = new int[0];

        int tirada;
        boolean seguir;
        do
        {
            for (int i= 0;i<ndados;i++)
            {

                tirada = vectordados[i].lanzar();
                System.out.println(tirada);
                tiradas = Arrays.copyOf(tiradas, tiradas.length+1);
                tiradas[tiradas.length-1] = tirada;
            }
            System.out.println("quieres seguir? (true/false)");
            seguir = sc.nextBoolean();
        }
        while(seguir==true);

        System.out.println("te han salido los siguientes números: "+Arrays.toString(tiradas)); */

        sc.close();
    }
}
