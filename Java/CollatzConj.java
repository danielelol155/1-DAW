import java.util.Scanner;

public class CollatzConj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int newnum=1;
        while (true) {
            System.out.print(newnum + " ");
            int num = newnum;

            while (num!=1)
            {
                if(num%2==0)
                {
                    num/=2;
                }
                else
                {
                    num*=3;
                    num++;
                }
            }
            System.out.println(num);
            newnum++;
        }
    }
}
