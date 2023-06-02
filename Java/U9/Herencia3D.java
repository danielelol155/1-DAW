import java.util.Arrays;
import java.util.Scanner;
class Linea //huerfana
{
    //atributos
    private Puntos2D puntosLinea[];
    //comportamientos
    Linea(Puntos2D valor, Puntos2D valor1)
    {
        puntosLinea = new Puntos2D[2];
        puntosLinea[0] = valor;
        puntosLinea[1] = valor1;

    }
    void meterpunto(Puntos2D valor2)
    {
        puntosLinea = Arrays.copyOf(puntosLinea, puntosLinea.length+1);
        puntosLinea[puntosLinea.length-1] = valor2;
    }
    Puntos2D[] getPuntos2d()
    {
        return puntosLinea;
    }
    void desplazar()
    {

    }
    void borrar(Puntos2D copialinea[], int valor)
    {
        
    }
    int tamaño()
    {
        return puntosLinea.length;
    }
    public boolean equals(Object otra)
    {
        Linea otraLinea = (Linea) otra;
        boolean resultado = true;

        if(this.tamaño() == otraLinea.tamaño())
        {
            //Comparar los puntos de las lineas
            for (int i = 0; i < this.tamaño() ; i++ )
            {
                if( !this.getPuntos2d()[i].setComparaPosinu(otraLinea.getPuntos2d()[i]) ) // '!' hace que: false -> true | true -> false
                {
                    resultado = false;
                    break;
                }
            }
        }
        else
        {
            //Sabemos que el tamaño de las lineas no son iguales, resultado=false
            resultado = false;
        }

        return resultado;
    }
    void mostrarpuntoslinea()
    {
        for (int i = 0 ; i < this.getPuntos2d().length ; i++ )
        {
            System.out.println("Punto "+ i + ": " + Arrays.toString(this.getPuntos2d()[i].getCoordenadas()));
            
        }
    }

    /* private int buscar(Puntos2D valor)
    {
        int resul = -1;
        for(int i = 0 ; i < this.tamaño(); i++)
        {
            if(this.puntosLinea[i].equals(valor))
            {
                resul = i;
            }
        }
        return resul;
    }  */
    /* private void eliminarOrdenado(Puntos2D valor)
    {
        int pos = buscar(valor);

        if (pos != -1)
        {
            Puntos2D copia[];
            copia = new Puntos2D[this.tamaño()-1];
            int cont = 0;
            for(int i = 0; i < this.tamaño(); i++)
            {
                if(i!=pos)
                {
                    copia[cont] = this.puntosLinea[i];
                    cont ++;
                }
            }
        }
        
    } */

    /* private int buscar(int valor, int tabla[])
    //busca un elemento en el array dado
    //si lo encuentra devuelve la posición del elemento
    //si no lo encuentra, devuelve -1
    {
        int encontrado = -1;
        for(int cont = 0; cont < tabla.length; cont++)
        {
            if(valor == tabla[cont])//encontrado
            {
                encontrado = cont;
                break;
            }
        }
        return encontrado;
    } */
}

class Puntos2D
{
    //Atributos(Estado)
    protected double x;// Si ponemos private delante, haremos que el atributo no sea modificable desde cualquier otra parte del código.
    protected double y;
    //Comportamiento(Interfaz)
    Puntos2D()// Por defecto //construtor
    {
        x = 2.0;
        y = 3.0;
    }
    Puntos2D(double valorx, double valory)
    {
        this.x = valorx;
        this.y = valory;
    }
    Puntos2D(Puntos2D otro)// construtor de copia
    {
        this.x = otro.x;
        this.y = otro.y;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    double[] getCoordenadas()
    {
        double coordenadas[] = new double[2];
        coordenadas[0] = x;
        coordenadas[1] = y;

        return coordenadas;
    }
    void setX(double x)
    {
        this.x = x;
    }
    void setY(double y)
    {
        this.y = y;
    }
    private boolean setComparaPosi(Puntos2D punto2)
    {
        boolean iguales = false; 
        if(this.x == punto2.x)
        {
            if(this.y == punto2.y)
                {
                    iguales = true;
                } 
        }
        return iguales;
    }
    boolean setComparaPosinu(Object punto2)// equals solo funciona con objetos
    {
        return (this.setComparaPosi((Puntos2D)punto2));

        // Punto2D otropunto = (Puntos2D)punto2;
        // boolean iguales = false; 
        // if(this.x == otropunto.x && this.y == otropunto.y)
        // {
        //     iguales = true;
        // }
        // return iguales;
    }
}
class Puntos3D extends Puntos2D
{
    private double z;

    Puntos3D()
    {
        x=0;
        y=0;
        z=0;
    }

    Puntos3D(double x, double y, double z)
    {
        super(x, y);
        this.z = z;
    }
    Puntos3D(Puntos3D otro)
    {   
        //super(otro.x, otro.y);
        //this.z = otro.z;
        this(otro.x, otro.y,otro.z);
        
    }

    double getZ()
    {
        return z;
    }

    void setZ(double z)
    {
        this.z = z;
    }
    double[] getCoordenadas()
    {
        double coordenadas[] = super.getCoordenadas();
        coordenadas = Arrays.copyOf(coordenadas, coordenadas.length+1);
        coordenadas[2] = z;
        return coordenadas;
    }
    boolean setComparaPosinu(Object otro)// equals solo funciona con objetos
    {
        return (super.setComparaPosinu((Puntos3D)otro));
    }

    boolean equals(Puntos3D q)
    {
        boolean flag = false;

        if ((this.x == q.x)&&(this.y == q.y)&&(this.z == q.z))
        {
            flag = true;
        }
        return flag;
    }

    boolean equals(double x1, double y1, double z1)
    {
        boolean flag = false;

        if ((this.x == x1)&&(this.y == y1)&&(this.z == z1))
        {
            flag = true;
        }

        return flag;
    }
    
    void shiftX (Double tx)
    {
        this.x += tx;
    }

    void shiftY (Double ty)
    {
        this.y += ty;
    }

    void shiftZ (Double tz)
    {
        this.z += tz;
    }

    void translate(double tx, double ty, double tz)
    {
        this.x += tx;
        this.y += ty;
        this.z += tz;
    }

    Puntos3D translate(Puntos3D q, double tx, double ty, double tz)
    {
        Puntos3D nuevo = new Puntos3D(q.x, q.y, q.z);
        nuevo.translate(tx, ty, tz);

        return nuevo;
    }

    double distancetoPoint(Puntos3D q)
    {
        double distancia;
        // el p1 va a ser q y el p2 será this
        distancia = Math.sqrt( Math.pow((this.x-q.x) , 2) + Math.pow((this.y-q.y) , 2) + Math.pow((this.z-q.z) , 2) );

        return distancia;
    }

    double distanceOrigin()
    {
        double distancia;
        Puntos3D q = new Puntos3D(0, 0, 0);

        distancia = this.distancetoPoint(q);

        return distancia;
    }

    double scalarProduct(Puntos3D q)
    {
        double p_Escalar;

        p_Escalar = (this.x*q.x + this.y*q.y + this.z*q.z);

        return p_Escalar;
    }

    String whichSpace()
    {
        // derecha, arriba y adelante serán positivos, mientras izq, abajo y atras negativos
        String dondeta="";

        // eje x
        if (this.x > 0)
        {
            dondeta += "derecha, ";
        }
        else if (this.x == 0)
        {
            dondeta += "sobre el eje x, ";
        }
        else
        {
            dondeta += "izquierda.";
        }

        // eje y
        if (this.y > 0)
        {
            dondeta += "arriba, ";
        }
        else if (this.y == 0)
        {
            dondeta += "sobre el eje y, ";
        }
        else
        {
            dondeta += "abajo.";
        }

        // eje z
        if (this.z > 0)
        {
            dondeta += "adelante, ";
        }
        else if (this.z == 0)
        {
            dondeta += "sobre el eje z, ";
        }
        else
        {
            dondeta += "atrás.";
        }

        return dondeta;

    }
    
    boolean inBox(double xbox, double ybox, double zbox, double width, double height, double depth)
    {
        boolean flag = false;

        // comprobamos que el x del punto esté en el rango de x en la caja
        if (this.x >= xbox && this.x <= (xbox+width))
        {
            if (this.y <= ybox && this.y >= (ybox-height))
            {
                if (this.z <= zbox && this.z >= (zbox-depth))
                {
                    flag = true;
                }
            }
        }

        return flag;
    }

    boolean inSphere(Puntos3D center, double radius)
    {
        boolean flag = false;

        if (this.distancetoPoint(center) <= radius)
        {
            flag = true;
        }

        return flag;
    }

    //Hola  Dani :)
}

class Suceso extends Puntos3D
{
    int tiempo;
    String descripcion;

    Suceso()
    {
        super(0,0,0);
        tiempo=0;
    }
    Suceso(int x, int y, int z, int t)
    {
        super(x,y,z);
        this.tiempo = t;
    }

    boolean equals(Suceso a)
    {
        boolean flag=false;

        if (super.equals(a))
        {
            if(this.tiempo== a.tiempo)
            {
                flag = true;
            }
        }

        return flag;
    }


    
}






public class Herencia3D
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Puntos2D punto;
        Puntos2D punto2;

        System.out.println("¿Cuanto vale x?");
        double valorx = sc.nextDouble();

        System.out.println("¿Cuanto vale y?");
        double valory = sc.nextDouble();
        
        punto = new Puntos2D(valorx,valory);

        punto2 = new Puntos2D();

        System.out.println("La coordenada del punto2 es: " + "x:" + punto2.getX() +" || " + "y: " + punto2.getY());
        
        if(punto.equals(punto2))
        {
            System.out.println("Están en la misma posición");
        }else
        {
            System.out.println("No están en la misma posición");
        }

        System.out.println("X vale: " + punto.getX());
        System.out.println("Y vale: " + punto.getY());
        System.out.println("La coordenada del punto es: " + "x:" + punto.getX() +" || " + "y: " + punto.getY());  
        
        System.out.println("¿Cuanto vale z?");
        double valorz = sc.nextDouble();

        Puntos3D punto3d = new Puntos3D(valorx, valory, valorz);

        
        System.out.print(Arrays.toString(punto3d.getCoordenadas()));
    }
}