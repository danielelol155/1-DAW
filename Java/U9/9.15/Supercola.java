

public class Supercola {

    Cola cola1;
    Cola cola2;

    public Supercola() {
        this.cola1 = new Lista();
        this.cola2 = new Lista();
    }

    void encolarEn1(String elem) {
        if (cola1.numeroElementos()>cola2.numeroElementos())
        {
            cola2.encolar(elem);
        }
        else
        {
            cola1.encolar(elem);
        }
    }

    void encolarEn2(String elem) {
        if (cola1.numeroElementos()<cola2.numeroElementos())
        {
            cola1.encolar(elem);
        }
        else
        {
            cola2.encolar(elem);
        }
    }

    String desencolarDe1() {
        String res = cola1.desencolar();
        if (res == null) {
            res = cola2.desencolar();
        }
        return res;
    }

    String desencolarDe2() {
        String res = cola2.desencolar();
        if (res == null) {
            res = cola1.desencolar();
        }
        return res;
    }

    public String toString() {
        return "cola1: " + cola1 + "cola2: " + cola2;
    }

}
