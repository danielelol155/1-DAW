import java.util.Scanner;
import java.util.function.BiConsumer;

class Calendario
{
    private int anyo, mes, dia;

    Calendario(int anyo, int mes, int dia)
    {
        if (anyo<=0)
        {
            this.anyo = 1;
        }
        else
        {
            this.anyo = anyo;
        }

        if (mes <1||mes>12)
        {
            this.mes =1;
        }
        else
        {
            this.mes = mes;
        }

        if (dia<1||dia>30)
        {
            this.dia = 1;
        }
        else
        {
            this.dia = dia;
        }
    }

    void incrementarDia()
    {
        this.dia++;
    }

    void incrementarMes()
    {
        this.mes++;
        
        if (this.mes>12)
        {
            this.mes=0;
            this.anyo++;
        }
    }
    
    void incrementarAnyo(int cantidad)
    {
        if (cantidad>0)
        {
            this.anyo+=cantidad;
        }
    }

    void mostrar()
    {
        System.out.println(this.dia+"/"+this.mes+"/"+this.anyo);
    }

    boolean iguales(Calendario otraFecha)
    {
        return this.equals(otraFecha);
    }

    boolean equals(Calendario  otro)
    {
        boolean flag = false;
        if (this.dia == otro.dia && this.mes == otro.mes && this.anyo == otro.anyo)
        {
            flag=true;
        }
        return flag;
    }
}






public class A_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calendario calendario, otCalendario;

        System.out.println("introduce día, mes y año respectivamente");

        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anyo = sc.nextInt();

        calendario = new Calendario(anyo, mes, dia);
        calendario.mostrar();

        calendario.incrementarDia();
        calendario.incrementarMes();
        System.out.println("introduce la cantidad de años que quieres incrementar");
        int anyos = sc.nextInt();
        calendario.incrementarAnyo(anyos);

        calendario.mostrar();

        otCalendario = new Calendario(6, 6, 6);
        otCalendario.mostrar();

        System.out.println(calendario.iguales(otCalendario));

    }
}
