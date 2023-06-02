class Diente
{
    int id;
    String estado;

    public Diente(int id, String estado)
    {
        this.id = id;
        this.estado = estado;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public int getId()
    {
        return id;
    }

    public String getEstado()
    {
        return estado;
    }
}



class Dentadura
{
    Diente dentadura[] = new Diente[32];

    Dentadura()
    {
        int pos=0;
        for (int i= 11; i<19;i++)
        {
            dentadura[pos] = new Diente(i, "Bien");
            pos++;
        }
        for (int i=21;i<29;i++)
        {
            dentadura[pos] = new Diente(i, "Bien");
            pos++;
        }
        for (int i=31;i<39;i++)
        {
            dentadura[pos] = new Diente(i, "Bien");
            pos++;
        }
        for (int i=41;i<49;i++)
        {
            dentadura[pos] = new Diente(i, "Bien");
            pos++;
        }
    }

    Dentadura(int[] cambiar, String estado)
    {
        // generamos una dentadura nueva para modificarla y despues actualizamos la dentadura original
        // dandole los valores de esta.

        int j=0;
        for (int i= 11; i<19;i++)
        {
            this.dentadura[j] = new Diente(i, "Bien");
            j++;
        }
        for (int i=21;i<29;i++)
        {
            this.dentadura[j] = new Diente(i, "Bien");
            j++;
        }
        for (int i=31;i<39;i++)
        {
            this.dentadura[j] = new Diente(i, "Bien");
            j++;
        }
        for (int i=41;i<49;i++)
        {
            this.dentadura[j] = new Diente(i, "Bien");
            j++;
        }

        for (int i=0;i<cambiar.length;i++)
        {

            int pos = buscarPos(cambiar[i]);

            this.dentadura[pos].setEstado(estado);
        }
    }


    public Diente getDiente(int id)
    {
        Diente diente;

        int pos = buscarPos(id);

        diente = this.dentadura[pos];
        return diente;
    }

    public void setDiente(int id, String estado)
    {
        int pos = buscarPos(id);

        dentadura[pos].setEstado(estado);
    }

    public void setDiente(int[] id, String estado)
    {
        for (int i=0;i<id.length;i++)
        {
            int pos = buscarPos(id[i]);

            dentadura[pos].setEstado(estado);
        }
    }

    private int buscarPos(int id)
    {
        int pos;
        for (pos = 0; pos<32;pos++)
        {
            // en esta condicion  buscamos la posicion en el array del diente con el id dado.
            if (this.dentadura[pos].getId() == id)
            {
                break;
            }
        }

        return pos;
    }

    private char charEstado(String estado)
    {
        char carac;

        switch (estado) {
            case "extraído" -> carac = ' ';
            case "empastado" -> carac = 'E';
            case "prótesis" -> carac = 'P';
            default -> carac = 'B';
        }


        return carac;
    }

    public void mostrar()
    {
        // maxilar superior
        System.out.println();
        // derecha
        for (int i=7;i>-1;i--)
        {
            System.out.print(charEstado(dentadura[i].getEstado())+" ");
        }
        for (int i=8;i<16;i++)
        {
            System.out.print(charEstado(dentadura[i].getEstado())+" ");
        }
        System.out.println();
        for (int i=31;i>23;i++)
        {
            System.out.print(charEstado(dentadura[i].getEstado())+" ");
        }
        for (int i=23;i>15;i++)
        {
            System.out.print(charEstado(dentadura[i].getEstado())+" ");
        }
        
    }

}


public class ClaseDentadura {
    public static void main(String[] args) {
        int cambiar[] = {11,12,18};
        Dentadura dentadura = new Dentadura(cambiar, "prótesis");

        int nuevocambio[] = {23,46,32,17};
        dentadura.setDiente(cambiar, "extraído");

        dentadura.mostrar();
    }
}
