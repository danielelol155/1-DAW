

import java.util.Scanner;

class Cifrado
{
    String Code;
    
    Cifrado(String codigo)
    {
        this.Code = codigo;
    }

    void cifrar(int incremento)
    {
        String nuevoString="";

        for (int i= 0; i<Code.length();i++)
        {
            char caract = Code.charAt(i);
            int a = caract;
            if (Character.isLetter(caract))
            {
                System.out.println();
                caract = convertir(caract, incremento);
                nuevoString += String.valueOf(caract);
                System.out.println(nuevoString);
            }
            else
            {
                nuevoString += String.valueOf(caract);
            }
        }
        this.Code = nuevoString;
    }

    private char convertir(char caract,int incremento)
    {
        char minusculas[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char MAYUSCULAS[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        // comprobamos si el caracter está en las minusculas
        int pos;
        boolean esminuscula = false;
        for (pos = 0;pos<minusculas.length;pos++)
        {
            if (caract == minusculas[pos])
            {
                esminuscula = true;
                break;
            }
            else if (caract == MAYUSCULAS[pos])
            {
                break;
            }
        }

        int newpos = pos+incremento;

        while (newpos>minusculas.length)
        {
            newpos-= minusculas.length;
        }

        if (esminuscula==true)
        {
            caract = minusculas[newpos];
        }
        else
        {
            caract = MAYUSCULAS[newpos];
        }
        return caract;
    }
}

public class A_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el código que quieras codificar:");
        String frase = sc.next();

        Cifrado codigo = new Cifrado(frase);

        System.out.println("introduce el las veces que quieres mover el codigo");
        int incremento = sc.nextInt();

        codigo.cifrar(incremento);
        System.out.println(codigo.Code);
    }
}
