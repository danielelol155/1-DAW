import java.lang.reflect.Constructor;

interface Sonido
{
    int version = 1;

    void voz();

    default void vozDurmiendo()
    {
        System.out.println("Zzzzzz");
    }
}

class Gato implements Sonido
{
    int edad;
    String color;
    String raza;
    double altura;

    Gato(int edad, String color, String raza, double altura)
    {
        this.edad = edad;
        this.color = color;
        this.raza = raza;
    }

    public void voz()
    {
        System.out.println("miau");
    }
}

class Perro implements Sonido
{
    int edad;
    String color;
    String raza;
    double altura;

    Perro(int edad, String color, String raza, double altura)
    {
        this.edad = edad;
        this.color = color;
        this.raza = raza;
    }

    public void voz()
    {
        System.out.println("guau");
    }



    
}



public class prueba {
    public static void main(String[] args) {
        Gato gato;

        
    }
}
