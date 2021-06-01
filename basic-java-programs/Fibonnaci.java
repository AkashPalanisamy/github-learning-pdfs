package BasicJavaPrograms;
import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a=0,b=1,fb;
        System.out.println(a+"\n"+b);
        for(int j=0;j<=i;j++)
        {
            fb=a+b;
            a=b;
            b=fb;
            System.out.println(fb);
        }
    }
}
