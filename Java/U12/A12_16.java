import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
class Academico
{
    String Nombre;
    LocalDate añoIngreso;

    Academico(String Nombre, String añoIngreso)
    {
        this.Nombre = Nombre;
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        this.añoIngreso = LocalDate.parse (añoIngreso, formatoFechas);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + " año: " + añoIngreso + "\n";
    }





}


public class A12_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Academico> academia = new TreeMap<>();

        for ( int i=0; i<5; i++)
        {
            System.out.println("Introduzca nombre");
            String nombre = sc.next();
            System.out.println("Introduce fecha:");
            String fecha = sc.next();

            System.out.println("Introduce letra: ");
            Character letra = sc.next().charAt(0);

            nuevoAcademico(academia, new Academico(nombre, fecha), letra);
        }
        
        System.out.println("Orden por letra" + academia);


        Collection<Academico> sinLetra = academia.values();
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);
        Collections.sort(listaSinLetra);






        
    }
    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra)
    {
        boolean flag= false;

        if ((letra>= 'A' && letra<= 'Z')
            || (letra >= 'a' && letra<='z')
            || (letra == 'ñ' || letra == 'Ñ'))
        {
            academia.put(letra, nuevo);
            flag = true;
        }
        else
        {
            System.out.println("Caracter no valido");
        }





        return flag;
    }
}
