
class Semaforo
{
    //ATRIBUTOS (ESTADO)
    byte estado; //0->rojo 1->naranja 2->verde
    boolean blink; //parpadea?
    boolean on; //encendido?
    byte tiempos[]; //tiempos para cada estado (máx 255seg)

    //COMPORTAMIENTO
    //constructor
    Semaforo() //por defecto
    {
        on=true;
        blink=false;
        estado=0;

        tiempos=new byte[3]; //tiempos para cada estado (máx 255seg)

        setTiempos((byte)43, (byte)1, (byte)56);
        //tiempos[0] = 43;
        //tiempos[1] = 1;
        //tiempos[2] = 56;
    }

    Semaforo(byte estado, boolean blink, boolean on, byte tr, byte tn, byte tv)
    {
        this.on=on;
        this.blink=blink;
        this.estado=estado;

        tiempos=new byte[3]; //tiempos para cada estado (máx 255seg)

        setTiempos(tr, tn, tv);
        //tiempos[0] = tr;
        //tiempos[1] = tn;
        //tiempos[2] = tv;
    }

    //getters y setters
    byte getEstado()
    {
        return estado;
    }

    boolean getBlink()
    {
        return blink;
    }

    boolean blink()
    {
        return blink;
    }

    boolean parpadea()
    {
        return blink;
    }

    boolean getOn()
    {
        return on;
    }

    boolean encendido()
    {
        return on;
    }

    byte getTiempo()
    //devuelve el tiempo asociado al estado ACTUAL del semáforo
    {
        return tiempos[estado];
    }

/*    void setOn(boolean nuevoValor)
    {
        on = nuevoValor;
    }
*/
    void encender() //setter para on
    {
        on = true;
        estado = 0;
        blink = false;
    }

    void apagar()
    {
        on = false;
    }

    void setBlink(boolean nuevoValor)
    {
        if(on == true)
        {
            blink = nuevoValor;

            if(blink == true)
            {
                estado = 1; //naranja
            }
            else
            {
                estado = 0;//rojo
            }
        }
    }

    void setTiempos(byte tr, byte tn, byte tv)
    {
        tiempos[0] = tr;
        tiempos[1] = tn;
        tiempos[2] = tv;
    }

    void changeEstado()
    {
        if(on == true)
        {
            if(blink == true)
            {
                setBlink(false);
            }
            else
            {
                switch (estado)
                {
                    case 0: estado=2; //de rojo a verde
                            break;
                    case 1: estado=0; //de naranja a rojo
                            break;
                    case 2: estado=1; //de verde a naranja
                            break;
                }
            }
        }
    }
}

public class Ejer_semaforo
{

    public static void main(String args[])
    {

      Semaforo s1;

      s1 = new Semaforo();
      s1 = new Semaforo((byte)0, true, false, (byte)0, (byte)200, (byte)6);

      if(s1.encendido() == true)
      {
        System.out.println("El semáforo está ON");
      }
      else
      {
        System.out.println("El semáforo está OFF");
      }

      s1.encender();

      if(s1.encendido() == true)
      {
        System.out.println("El semáforo está ON");
      }
      else
      {
        System.out.println("El semáforo está OFF");
      }

      s1.setBlink(true);
    }
}
