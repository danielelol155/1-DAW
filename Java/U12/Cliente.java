import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;

class Cliente implements Comparable <Cliente>
{
    String dni;
    String nombre;
    LocalDate fechaNacimiento;
    Cliente (String dni, String nombre, String fechaNacimiento) 
    {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse (fechaNacimiento, formatoFechas);
    } 
    public String getNombre ()
    {
        return nombre;
    }

    int edad()
    {
        return (int) fechaNacimiento.until (LocalDate.now(), ChronoUnit.YEARS);
    }

    
    
    @Override
    public boolean equals (Object ob)
    {
        return dni.equals(((Cliente)ob).dni);
    }
    
    
    @Override
    /* public int compareTo(Cliente otro) {
        
        return dni.compareTo(otro.dni);
    } */

    public int compareTo (Cliente otro)
    {
        return nombre.compareTo(otro.nombre);
    }

    

    @Override
    public String toString()
    {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }

    
}
