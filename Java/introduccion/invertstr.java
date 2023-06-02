public class invertstr
{
    public static void main (String[] args)
    {
        String s1, sInvertida;
        s1 = "Pepe";
        sInvertida ="";
        for (int indice = s1.length() -1; indice >=0; indice--)
        {
            sInvertida += s1.charAt(indice);
        }
        System.out.println("cadena original: "+ s1);
        System.out.println("cadena invertida: "+sInvertida);


    }
}
