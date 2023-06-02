import java.util.Scanner;

public class propuestas {

    // Ejercicio 12

    public static double distancia(double x1, double y1, double x2, double y2)
    {

        double resul, powx, powy;

        powx = Math.pow((x1-x2), 2);
        powy = Math.pow((y1-y2), 2);

        resul = Math.sqrt(powx+powy);

        return resul;
    }

    public static void ejer12()
    {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;
        double resul;

        System.out.println("introduce la posición en x e y de 1 respesctivamente");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("introduce la posición en x e y de 2 respesctivamente");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        resul = distancia(x1, y1, x2, y2);
        System.out.print("la distancia euclidea de 1 y 2 es: "+resul);

        sc.close();
    }

    // Ejercicio 14

    public static int TO_segundos(int d, int h, int m, int s)
    {
        int resul;

        resul = s + ((m + ((h + (d * 24)) * 60)) * 60);

        return resul;
    }

    public static void ejer14()
    {
        Scanner sc = new Scanner(System.in);

        int dias, horas, minutos, segundos;
        int resul;

        System.out.println("introduce la cantidad de días, horas, minutos y segundos respectivamente:");
        dias = sc.nextInt();
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();

        resul = TO_segundos(dias, horas, minutos, segundos);

        System.out.println("el numero total de segundos es: "+resul);

        sc.close();
    }

    // Ejercicio 15

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
    {
        int diferenciaMin;

        minuto1 += (hora1*60);
        minuto2 += (hora2*60);

        diferenciaMin = Math.abs((minuto1-minuto2));

        return diferenciaMin;
    }

    public static void ejer15()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el tiempo de 1 en horas y minutos respectivamente:");
        int hora1 = sc.nextInt();
        int minuto1 = sc.nextInt();

        System.out.println("introduce el tiempo de 2 en horas y minutos respectivamente:");
        int hora2 = sc.nextInt();
        int minuto2 = sc.nextInt();

        int dif = diferenciaMin(hora1, minuto1, hora2, minuto2);

        System.out.println("La diferencia de minutos de los dos tiempos es de: " + dif + " minutos.");

        sc.close();
    }

    // Ejercicio 17

    public static boolean amigos(int n1, int n2)
    {
        int i;
        int suma=0;
        boolean amigo = false;

        for (i = 1; i < n1; i++)
        {
            if ((n1 % i) == 0)
            {
                suma += i;
            }
        }

        if (suma == n2)
        {
            amigo = true;
        }

        return amigo;
    }

    public static void ejer17()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos posibles numeros amigos a y b respectivamente");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();


        boolean amigo = amigos(numero1,numero2);

        if (amigo == true)
        {
            System.out.println("los dos números son amigos");
        }
        else
        {
            System.out.println("Los dos numeros no son amigos");
        }

        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ejercicio que quieras ejecutar: ");
        int ejer = sc.nextInt();

        switch (ejer) {
            case 12 -> ejer12();

            case 14 -> ejer14();

            case 15-> ejer15();

            case 17 -> ejer17();
        }

        sc.close();
    }
}
