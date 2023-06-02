package com.mycompany.primeraprueba;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;


class Punto
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
