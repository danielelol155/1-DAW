public class E5_1 {
    public static void main(String[] args) {
        int[] tabla= new int[10];

        for (int i=0; i < tabla.length;i++)
        {
            tabla[i] = (int)((Math.random() * 100)+1);
        }

        int suma=0;

        for (int i=0; i<tabla.length;i++)
        {
            suma += tabla[i];
        }

        System.out.println(suma);
    }
}
