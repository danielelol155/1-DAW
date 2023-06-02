class Hora
{
    byte hora, minutos;

    Hora()
    {
        this.hora = 0;
        this.minutos = 0;
    }

    Hora(byte hora, byte minutos)
    {
        this.hora = hora;
        this.minutos = minutos;
    }

    void inc()
    {
        minutos++;

        if (minutos ==60)
        {
            hora++;
            minutos = 0;
        }
        if (hora == 24)
        {
            hora = 0;
        }

    }

    boolean setMinutos(byte valor)
    {
        boolean flag = true;
        if (valor >=60)
        {
            flag = false;
        }
        else
        {
            for (int i=0;i<valor;i++)
            {
                inc();
            }
        }

        return flag;
    }

    boolean setHora(byte valor)
    {
        boolean flag= true;

        if (valor>=24)
        {
            flag = false;
        }
        else 
        {
            hora += valor;
            if (hora>=24)
            {
                hora-=24;
            }
        }

        return flag;
    }

    String tostString()
    {
        String a ="" + hora + ":"+minutos;
        
        return a;
    }
}

class HoraExacta extends Hora
{
    protected byte segundos;

    HoraExacta(byte hora, byte minutos,byte segundos)
    {
        this.hora = hora;
        this.minutos=minutos;
        this.segundos = segundos;
    }

    boolean setSegundos(byte valor)
    {
        boolean flag = true;
        if (valor >=60)
        {
            flag = false;
        }
        else
        {
            for (int i=0;i<valor;i++)
            {
                inc();
            }
        }

        return flag;
    }

    void inc()
    {
        this.segundos++;

        if (segundos ==60)
        {
            segundos = 0;
            super.inc();
        }
        
    }
    
    boolean equals(HoraExacta a)
    {
        boolean flag = false;

        if (this.hora==a.hora)
        {
            if (this.minutos==a.minutos)
            {
                if (this.segundos==a.segundos)
                {
                    flag=true;
                }
            }
        }

        return false;
    }

}

public class A8_1
{
    public static void main(String[] args)
    {
        Hora hora = new Hora((byte) 16, (byte) 35);

        hora.tostString();
        for (int i=0; i<445;i++)
        {
            hora.inc();
            
            System.out.println(hora.tostString());
            
        }
    }
}
