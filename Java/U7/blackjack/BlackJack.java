import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

class Baraja
{
    private Carta baraja[];
    Baraja()
    {
        // sin 8 9 ni caballeros
        baraja = new Carta[44];
        int cont= 0;

        for (int j=1;j<8;j++)
        {
            Carta carta = new Carta(j, "pica");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=10;j<12;j++)
        {
            Carta carta = new Carta(j, "pica");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=13;j<15;j++)
        {
            Carta carta = new Carta(j, "pica");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=1;j<8;j++)
        {
            Carta carta = new Carta(j, "trebol");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=10;j<12;j++)
        {
            Carta carta = new Carta(j, "trebol");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=13;j<15;j++)
        {
            Carta carta = new Carta(j, "trebol");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=1;j<8;j++)
        {
            Carta carta = new Carta(j, "corazon");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=10;j<12;j++)
        {
            Carta carta = new Carta(j, "corazon");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=13;j<15;j++)
        {
            Carta carta = new Carta(j, "corazon");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=1;j<8;j++)
        {
            Carta carta = new Carta(j, "diamante");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=10;j<12;j++)
        {
            Carta carta = new Carta(j, "diamante");
            baraja [cont] = carta;
            cont++;
        }
        for (int j=13;j<15;j++)
        {
            Carta carta = new Carta(j, "diamante");
            baraja [cont] = carta;
            cont++;
        }
    }

    void addOchosYnueves()
    {
        int cont = this.baraja.length;
        baraja = Arrays.copyOf(baraja, baraja.length+8);
        for (int j=8;j<10;j++)
            {
                Carta carta = new Carta(j, "pica");
                baraja [cont] = carta;
                cont++;
            }
            for (int j=8;j<10;j++)
            {
                Carta carta = new Carta(j, "trebol");
                baraja [cont] = carta;
                cont++;
            }
            for (int j=8;j<10;j++)
            {
                Carta carta = new Carta(j, "corazon");
                baraja [cont] = carta;
                cont++;
            }
            for (int j=8;j<10;j++)
            {
                Carta carta = new Carta(j, "diamante");
                baraja [cont] = carta;
                cont++;
            }
    }

    void addCaballeros()
    {
        int cont = this.baraja.length;
        baraja = Arrays.copyOf(baraja, baraja.length+4);
            
            Carta carta = new Carta(12, "pica");
            baraja [cont] = carta;
            cont++;
        
            carta = new Carta(12, "trebol");
            baraja [cont] = carta;
            cont++;

            carta = new Carta(12, "corazon");
            baraja [cont] = carta;
            cont++;

            carta = new Carta(12, "diamante");
            baraja [cont] = carta;
            cont++;
        
    }
    
    Baraja(boolean ochoynueves, boolean caballeros)
    {
        this();
        
        if (ochoynueves)
        {
            this.addOchosYnueves();
        }
        if (caballeros)
        {
            this.addCaballeros();
        }
    }

    void mezclar()
    {
        int pos1, pos2;

        Carta aux;

        for (int i = 0;i<1000;i++)
        {
            pos1 = (int)(Math.random()*this.baraja.length);
            pos2 = (int)(Math.random()*this.baraja.length);

            if (pos1 != pos2)
            {
                aux = this.baraja[pos2];
                this.baraja[pos2] = this.baraja[pos1];
                this.baraja[pos1] = aux;
            }
        }
    }

    void barajar()
    {
        this.mezclar();
    }


    public static int buscar(int valor, int tabla[])
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
    }

    public Carta robar()
    {
        this.mezclar();
        Carta temp = baraja[baraja.length-1];
        baraja = Arrays.copyOf(baraja, baraja.length-1);

        return temp;
    }

    public void reinicializar()
    {
        boolean ochoynueves;
        boolean caballeros;
        if (this.baraja.length == 44)
        {
            caballeros = false;
            ochoynueves = false;
        }
        else if (this.baraja.length == 48)
        {
            caballeros = true;
            ochoynueves = false;
        }
        else if (this.baraja.length == 52)
        {
            caballeros = false;
            ochoynueves = true;
        }
        else 
        {
            caballeros = true;
            ochoynueves = true;
        }
    }
    

    public void mostrar()
    {
        for (int i= 0;i<baraja.length;i++)
        {
            baraja[i].mostrar();
        }
    }
}

class Carta
{
    private String palo;
    private int valor;

    Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    public int getvalor()
    {
        return this.valor;
    }

    public String getpalo()
    {
        return this.palo;
    }

    public String getcolor()
    {
        String color;
        if (this.palo == "pica" || this.palo  == "trebol")
        {
            color = "negro";
        }
        else
        {
            color = "rojo";
        }

        return color;
    }

    public void mostrar()
    {
        if (valor==11)
        {
            System.out.print("J");
        }

        else if (valor==12)
        {
            System.out.print("C");
        }

        else if (valor==13)
        {
            System.out.print("Q");
        }

        else if (valor==14)
        {
            System.out.print("K");
        }
        
        else
        {
        System.out.print(valor);
        }
        switch (palo)
        {
            case "pica" -> System.out.println('\u2660');
            case "corazon" -> System.out.println('\u2665');
            case "trebol" -> System.out.println('\u2663');
            case "diamante" -> System.out.println('\u2666');
        }
    }
}


public class BlackJack {
    public static void main(String[] args) {
        Baraja baraja1 = new Baraja(true, false);

        baraja1.barajar();
        baraja1.mostrar();
    }
}
