import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

class Registro
{
    LocalTime hora;
    double temperatura;

    Registro()
    {
        this.temperatura=25;
    }
    Registro(double temperatura)
    {
        this.temperatura=temperatura;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return hora.equals(((Registro) obj) .hora);
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());

        return "Registro{" + "hora=" + hora.format(f) + ", temperatura = " + temperatura + "ºC}\n";
    }

}













public class A12_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Registro> temperaturas = new LinkedHashSet<>();
        int opcion;
        do
        {
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Salir");
            System.out.print("introducir opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Introduce un valor del 1 al 4");
                    break;
            }
        }
        while (opcion !=4);








        sc.close();
    }
}



/* apartado del ticher. hacer que permita ordenar la temperatura tanto ascendentemente como descendente los registros */