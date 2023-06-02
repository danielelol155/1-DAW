package ez;
class Hora
{
    protected byte hora;
    protected byte minuto;


    Hora (byte hora, byte minuto)
    {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc()
    {
        this.minuto++;
        
        if (this.minuto==60)
        {
            this.minuto=0;
            this.hora++;

            if (this.hora==24)
            {
                this.hora = 0;
            }
        }
    }

    public boolean setMinuto(byte minuto) {
        boolean flag = false;

        if (0<= minuto && minuto < 60)
        {
            flag = true;
            this.minuto = minuto;
        }

        return flag;
    }

    public boolean setHora(byte hora) {
        boolean flag = false;

        if (0<= hora && hora < 24)
        {
            flag = true;
            this.hora = hora;
        }

        return flag;
    }

    /* public String tostring()
    {
        String a="";

        if (this.hora<10)
        {
            a +="0"+this.hora;
        }
        else
        {
            a+=this.hora;
        }

        a+=":";

        if (this.minuto<10)
        {
            a +="0"+this.minuto;
        }
        else
        {
            a+=this.minuto;
        }

        return a;
    } */

    @Override
    public String toString() {
        String a="";

        if (this.hora<10)
        {
            a +="0"+this.hora;
        }
        else
        {
            a+=this.hora;
        }

        a+=":";

        if (this.minuto<10)
        {
            a +="0"+this.minuto;
        }
        else
        {
            a+=this.minuto;
        }

        return a;
    }
}



class HoraExacta extends Hora
{
    byte segundo;
    HoraExacta(byte hora, byte minuto, byte segundo)
    {
        super(hora, minuto);
        this.segundo = segundo;
    }


    public boolean setSegundo(byte segundo) {
        boolean flag = false;

        if (0<= segundo && segundo < 60)
        {
            flag = true;
            this.segundo = segundo;
        }

        return flag;
    }

    public void inc()
    {
        this.segundo++;
        
        if (this.segundo==60)
        {
            super.inc();
        }
    }

    @Override
    public String toString() {
        String a="";

        if (this.hora<10)
        {
            a +="0"+this.hora;
        }
        else
        {
            a+=this.hora;
        }

        a+=":";

        if (this.minuto<10)
        {
            a +="0"+this.minuto;
        }
        else
        {
            a+=this.minuto;
        }

        a+=":";

        if (this.segundo<10)
        {
            a +="0"+this.segundo;
        }
        else
        {
            a+=this.segundo;
        }

        return a;
    }


    @Override
    public boolean equals(Object obj) {
        HoraExacta objExacta = (HoraExacta) obj;

        boolean flag= false;

        if (this.hora == objExacta.hora
        && this.minuto == objExacta.minuto
        && this.segundo == objExacta.segundo)
        {
            flag = true;
        }

        return flag;
    }



}






public class A8_1
{
    public static void main(String[] args) {
        Hora hora = new Hora((byte)0, (byte)0);
        HoraExacta horaExacta = new HoraExacta((byte)0, (byte)0, (byte)0);


        System.out.println(hora.toString());

        System.out.println(horaExacta.toString());

    }
}