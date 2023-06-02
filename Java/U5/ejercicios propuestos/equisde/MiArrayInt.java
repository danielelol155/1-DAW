package equisde;
import java.util.Arrays;

public class MiArrayInt
//herramientas que no están en la clase Arrays para usar con enteros
{
    public static int buscar(int v[], int elem)
    //busca un elemento en el vector v
    //si lo encuentra, devuelve la posición
    //si no lo encuentra, devuelve -1
    {
        int resul=-1; //suponemos que no está
        int elemento;

        for(int j=0; j<v.length; j++)
        {
            elemento = v[j];

            if(elem == elemento) //está!!!
            {
                resul = j;
                break; //no necesitamos comparar más
            }
        }

        return resul;
    }

    /*
    public static ... insertar(...)
    //inserta un nuevo elemento en el array pasado como argumento
    {

    }

    public static ... eliminar(...)
    //elimina un elemento del array pasado como argumento
    {
        
    }
    */
    public static int[] sinRepetidos(int t[])
    {
        int resul[];

        resul = new int[0];
        
        for(int i=0; i<t.length; i++) 
        {
            if(buscar(resul, t[i])==-1) //si no está...
            //insertamos en resul el nuevo elemento que hemos comprobado
            //que no está repetido
            {
                resul = insertar(resul, t[i]);

            }
        }

        return resul;
    }

    public static void reverseProc(int input[])
    {
        int last = input.length - 1;
        int middle = input.length / 2;
        
        for (int i = 0; i <= middle; i++)
        {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

    public static int[] insertar(int[] resul, int elem)
    {
        resul = Arrays.copyOf(resul, resul.length+1);
        resul[resul.length-1] = elem;


        return resul;
    }

}