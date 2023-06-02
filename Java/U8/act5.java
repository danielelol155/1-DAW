import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class Password
{
    private int longitud;
    private String contraseña;
    private boolean encriptada;

    Password()
    {
        this.longitud=8;
        this.contraseña = generarPassword(longitud);
        this.encriptada = false;
    }

    Password(int longitud)
    {
        this.longitud = longitud;
        this.contraseña = generarPassword(longitud);
        this.encriptada = false;
    }


    public void mostrarPassword()
    {
        System.out.println(this.contraseña);
    }

    public boolean esFuerte()
    {
        boolean esFuerte=false;
        int mayusculas=0;
        int minusculas=0;
        int numeros=0;

        for (int i=0;i<this.longitud;i++)
        {
            if (esNumero(this.contraseña.charAt(i)))
            {
                numeros++;
            }

            if (esMinuscula(this.contraseña.charAt(i)))
            {
                minusculas++;
            }

            if (esMayudcula(this.contraseña.charAt(i)))
            {
                mayusculas++;
            }

        }

        if (numeros>=5 && mayusculas>=2 && minusculas>=1)
        {
            esFuerte = true;
        }

        return esFuerte;
    }

    private boolean esNumero(char a)
    {
        char nums[] = {'0','1','2','3','4','5','6','7','8','9'};
        boolean flag=false;

        for (int i=0;i<nums.length;i++)
        {
            if (a==nums[i])
            {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean esMinuscula(char a)
    {
        char minusculas[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean flag=false;

        for (int i=0;i<minusculas.length;i++)
        {
            if (a==minusculas[i])
            {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean esMayudcula(char a)
    {
        char mayuscula[] = {'A','B','c','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean flag=false;

        for (int i=0;i<mayuscula.length;i++)
        {
            if (a==mayuscula[i])
            {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String generarPassword(int longitud)
    {
        String caracteres = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234567890";
        int longcaracteres = caracteres.length();
        String contraseña="";

        for (int i=0;i<longitud;i++)
        {
            int random = (int)(Math.random()*longcaracteres);

            contraseña += caracteres.charAt(random);
        }


        return contraseña;
    }




    public void Encriptar()
    {
        Base64.Encoder encoder = Base64.getEncoder();
        this.contraseña = encoder.encodeToString(this.contraseña.getBytes(StandardCharsets.UTF_8));
        this.encriptada = true;
    }

    public void Desencriptar()
    {
        Base64.Decoder bDecoder = Base64.getDecoder();
        byte[] decodedByteArray = bDecoder.decode(this.contraseña);

        this.contraseña = new String(decodedByteArray);
        this.encriptada = false;
    }
}




public class act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la contraseña:");

        int longitud = sc.nextInt();

        Password password = new Password(longitud);


        password.mostrarPassword();
        System.out.println(password.esFuerte());
        password.Encriptar();
        password.mostrarPassword();
        password.Desencriptar();
        password.mostrarPassword();
    }
}
