abstract class Poligono
{
    protected double base, altura;
    abstract double area();
}

class Triangulo extends Poligono
{
    Triangulo()
    {
        base =1;
        altura = 1;
    }

    Triangulo(double base,double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        double area;

        area = (base*altura)/2;
        return area;
    }
}

class Rectangulo extends Poligono
{
    Rectangulo()
    {
        base =1;
        altura = 1;
    }

    Rectangulo(double base,double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        double area;

        area = (base*altura);
        return area;
    }
}




public class A23
{
    
}
