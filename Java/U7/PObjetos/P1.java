class Tanque
{
    private double capacidad= 5000;
    private double cisterna;
    
    Tanque()
    {
        cisterna=0;
    }
    
    public double getContenido() {
        return cisterna;
    }

    public void agregar(double cantidad)
    {
        this.cisterna += cantidad;
        if (cisterna>capacidad)
        {
            cisterna = capacidad;
            System.out.println("El tanque está lleno");
            System.out.println(cisterna);

        }
        else
        {
            System.out.println(cisterna);
        }
    }

    public void sacar(double cantidad)
    {
        this.cisterna -=cantidad;
        if (cisterna<0)
        {
            cisterna = 0;
            System.out.println("El tanque está vacío");
            System.out.println(cisterna);

        }
        else
        {
            System.out.println(cisterna);
        }
    }

    public void sacaMitad()
    {
        if (cisterna>0)
        {
            cisterna/=2;
            System.out.println(cisterna);
        }
        else
        {
            System.out.println("tanque vacio");
            System.out.println(cisterna);

        }
    }

}

public class P1 {
    public static void main(String[] args) {
        Tanque t = new Tanque();
        t.agregar(100);

        for (int i=0;i<1081;i++)
        {
            if(t.getContenido()<1.0)
            {
                break;
            }
            else
            {
                t.sacaMitad();
            }
        }

    }
}
