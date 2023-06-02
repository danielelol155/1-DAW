package lkaskjdkdf;

import java.util.Arrays;

class Cola
{
    Integer cola[];

    public Cola(Integer cola[])
    {
        this.cola = cola;
    }

    public añadirCola(Integer nuevo)
    {
        this.cola = Arrays.copyOf(this.cola, this.cola.length+1);
        this.cola[this.cola.length-1] = nuevo;
    }

    public void mostrar()
    {
        System.out.println(Arrays.toString(this.cola));
    }

}


public class A_18 {
    public static void main(String[] args) {
        
    }
}
