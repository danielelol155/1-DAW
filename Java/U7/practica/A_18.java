import java.util.Arrays;

class Cola
{
    Integer cola[]= new Integer[0];

    Cola(int elementos[])
    {
        for (int i=0;i<elementos.length;i++)
        {
            cola = Arrays.copyOf(cola, cola.length+1);
            cola[i] = elementos[i];
        }
    }

    public void AumentarCola(int nuevo_elemento)
    {
        cola = Arrays.copyOf(cola, cola.length+1);
        cola[cola.length-1] = nuevo_elemento;
    }
    
    public void DisminuirCola()
    {
        
    }
}


public class A_18
{
    public static void main(String[] args) {
        
    }
}
