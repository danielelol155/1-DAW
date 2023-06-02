public class A3_10_while {
    public static void main(String[] args) {
        int num=1, cont=0, tot;

        tot = num;
        System.out.println(tot);
        while (cont<9)
        {
            num+=2;
            tot+=num;
            System.out.println(tot);
            cont++;
        }
    }
}
