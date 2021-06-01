package BasicJavaPrograms;
import java.util.Scanner;
public class Fibonaaci_Recursion {
    static int fb;
    static int a=0,b=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.println(a+"\n"+b);
        fib(count);
    }
    static int fib(int n)
    {
        if(n==0)
            return 1;
        else
        {
            fb=a+b;
            a=b;
            b=fb;
            System.out.println(fb);
            n--;
            return fib(n);
        }
    }
}
