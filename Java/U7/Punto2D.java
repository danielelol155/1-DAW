
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;

class  Punto
{
    // ESTADO
    private double pos[]=new double[2];

    // CONSTRUCTOR
    Punto()
    {
        pos[0]=0;
        pos[1]=0;
    }
    Punto(double ejex,double ejey)
    {
        pos[0] = ejex;
        pos[1] = ejey;
    }

    // GETTERS
    double[] get_Pos()
    {
        return pos;
    }
    
    void set_Pos(double  ejex, double ejey)
    {
        pos[0] = ejex;
        pos[1] = ejey;
    }

    private boolean compararPuntos(Punto punto2)
    {
        boolean flag= false;

        if (Double.compare(pos[0], punto2.pos[0])==0)
        {
            if (Double.compare(pos[1], punto2.pos[1])==0)
            {
                flag = true;
            }
        }

        return flag;
    }
    public boolean equals(Punto punto2)
    {
        return (this.compararPuntos(punto2)) ;
    }

}

class Linea
{
    // ESTADO
    private Punto linea[];

    Linea(Punto punto, Punto punto2)
    {
        linea = new Punto[2];

        // posPunto lo utilizaremos para hallar la posición donde meteremos el nuevo punto.
        linea[0]= punto;
        linea[1]= punto2;
    }

    public void AñadirPunto(Punto punto)
    {
        linea = Arrays.copyOf(linea,linea.length+1);

        // posPunto lo utilizaremos para hallar la posición donde meteremos el nuevo punto.
        int posPunto= linea.length-1;

        linea[posPunto]= punto;
    }

    public void MostrarLinea()
    {
        for (int i=0;i<linea.length;i++)
        {
            double pos[] = linea[i].get_Pos();
            System.out.println(Arrays.toString(pos));
        }
    }

    public void BorrarPunto(Punto punto)
    {
        int posBorrada = -1;
        // buscamos el punto que vamos a quitar.
        for (int i= 0; i< linea.length;i++)
        {
            if (linea[i].equals(punto))
            {
                posBorrada = i;
                break;
            }
        }

        if (posBorrada >= 0)
        {
            Punto[] aux;
            // desplazamos los elementos posteriores a  indiceBorrador
            aux = quitarPuntoLinea(linea, posBorrada);
            linea = aux;
            // MostrarLinea();
        }
        else{
            System.out.println("ese punto no existe");
        }


    }

    public void BorrarLinea(int pos)
    {

    }

    public static Punto[] quitarPuntoLinea(Punto[] linea, int pos)
    {
        Punto new_linea[]= new Punto[linea.length-1];

        for (int i=0;i<pos;i++)
        {
            new_linea[i]= linea[i];
        }

        for (int i = pos;i<(linea.length-1);i++)
        {
            new_linea[i] = linea[i+1];
        }

        return new_linea;
    }

}

public class Punto2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Punto punto[] = new Punto[5];
        Linea linea;

        System.out.println("introduce la posición del punto 1 en el eje x:");
        double ejex = sc.nextDouble();
        System.out.println("introduce la posición del punto 1 en el eje y:");
        double ejey = sc.nextDouble();

        punto[0] = new Punto(ejex, ejey);

        double pos[] = punto[0].get_Pos();
        System.out.println(Arrays.toString(pos));

        System.out.println("introduce la posición del punto 2 en el eje x:");
        ejex = sc.nextDouble();
        System.out.println("introduce la posición del punto 2 en el eje y:");
        ejey = sc.nextDouble();

        punto[1] = new Punto(ejex, ejey);

        // System.out.println(flag);

        linea = new Linea(punto[0], punto[1]);
        
        linea.MostrarLinea();


        punto[2] = new Punto(7,9);
        linea.AñadirPunto(punto[2]);
        
        System.out.println();
        linea.MostrarLinea();
        // vamos a añadir un punto
        punto[3] = new Punto(1, 1);

        linea.BorrarPunto(punto[3]);
        System.out.println();

        linea.MostrarLinea();


        sc.close();
    }

}