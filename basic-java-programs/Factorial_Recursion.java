package BasicJavaPrograms;
import java.util.Scanner;
public class Factorial_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(fact(i));
    }
    static int fact(int n)
    {
        if(n==1)
            return 1;
        else
            {
                return (n*fact(n-1));
            }

    }
}
