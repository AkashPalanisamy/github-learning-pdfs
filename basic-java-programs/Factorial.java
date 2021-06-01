package BasicJavaPrograms;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int fact=1;
        for(int j = 1;j<=i;j++)
        {
            fact *= j;
        }
        System.out.println(fact);
    }
}
