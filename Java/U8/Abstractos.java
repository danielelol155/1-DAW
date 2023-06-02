abstract class A
{
    int x = 1;
    void metodo1()
    {
        System.out.println("metodo1 definido en A");
    }

    abstract void metodo2();
}

class B extends A
{
    void metodo2()
    {
        System.out.println("metodo2 implementado en B");
    }
}

class C extends A
{
    void metodo2()
    {
        System.out.println("metodo2 implementado en C");
    }
}

public class Abstractos {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println("Valor de x en laclase B: "+b.x);
        b.metodo1();
        b.metodo2();
        c.metodo1();
        c.metodo2();     
    }
}
