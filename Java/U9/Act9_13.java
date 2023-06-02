class Futbolista implements Comparable
{
    private int DNI;
    private String nombre;
    private byte edad;
    private int numero_goles;

    Futbolista(int DNI, String nombre, byte edad, int numero_goles)
    {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.numero_goles = numero_goles;
    }

    
    public boolean equals(Futbolista a) {
        boolean flag = false;

        if (this.DNI == a.DNI)
        {
            flag =true;
        }

        return flag;
    }


    @Override
    public int compareTo(Object ob) {
        // TODO Auto-generated method stub
        int resul;
        Futbolista furbolista = (Futbolista)ob;
        
        


        return 0;
    }

}



















public class Act9_13 {
    
}
