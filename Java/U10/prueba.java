public class prueba {
    public static void main(String[] args) {
        int a=0, b=0;

        try
        {
            int c;
            c= a/b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("error: division por cero");
        }
    }
}
