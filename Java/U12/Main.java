import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main 
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Cliente p = new Cliente("44444444A", "Pepe Perez", "11/04/1998");
        //System.out.println(p.edad());
        //System.out.println(p.compareTo(r));


        List <Cliente> listaClientes = new ArrayList<>();
        Collection <Cliente> coleccionClie = listaClientes;
        //listaClientes.add(p);
        coleccionClie.add(new Cliente("4444", "Dani", "03/03/2004"));
        coleccionClie.add(new Cliente("4444", "Laura", "09/02/1998"));
        coleccionClie.add(new Cliente("4444", "Enrique", "09/12/2004"));
        coleccionClie.add(new Cliente("4444", "Manu", "09/12/2004"));
        coleccionClie.add(new Cliente("4444", "zanu", "09/12/2004"));


        System.out.println(listaClientes.size());
        System.out.println(coleccionClie.isEmpty());
        System.out.println(coleccionClie.size());

        //coleccionClie.clear();
        System.out.println(coleccionClie.size());
        System.out.println(listaClientes.size());

        //int compareToIgnoreCase (String cadena)

        Iterator <Cliente> it = coleccionClie.iterator();


       
        Cliente menor = it.next();
        for (; it.hasNext();) //tiene siguiente?
        //que salga el nombre mas pequeño alfabeticamente
        {
            Cliente p = it.next();
            if(menor.getNombre().compareTo(p.getNombre())<0)
            {   
                menor = p;
            }
            /* if (it.compareTo(it.next())<0)
            {
                nombre = it;
            }
            Cliente p = it.next();
            System.out.println(p); */
            

        } 
        System.out.println(menor);
        //System.out.println(listaClientes.compareTo);

    }
}