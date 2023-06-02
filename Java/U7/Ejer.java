
import java.util.Scanner;

class Persona
{
    // ATRIBUTOS (ESTADO)
    String nombre = "SIN NOMBRE";
    byte edad;
    double estatura;

    // COMPORTAMIENTO (INTERFAZ)
    void saludar(String msg)
    {
        System.out.println("hola, me llamo " + this.nombre);
        System.out.println(msg);
    }

}

public class Ejer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Persona p1, vbleX, clase;
        /* int a, b;
        float c; */

        p1 = new Persona(); //reservamos memoria
        p1.nombre = "Pepa";

        vbleX = new Persona();

        System.out.println(p1.nombre);
        System.out.println(vbleX.nombre);
        clase = p1; //dos variables apuntan al mismo objeto
        System.out.println(clase.nombre);
        
        clase.nombre="Paco";
        System.out.println(clase.nombre);
        System.out.println(p1.nombre);

        System.out.println("introduce el saludo que quieres que diga: ");
        String mensaje = sc.next();
        
        p1.saludar(mensaje);
        

        sc.close();
    }
}
