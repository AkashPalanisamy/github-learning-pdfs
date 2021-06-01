/*
Perfect numbers:
A positive integer that is equal to the sum of its proper divisors.
The smallest perfect number is 6, which is the sum of 1, 2, and 3.
Other perfect numbers are 28, 496, and 8,128.
 */

package BasicJavaPrograms;
public class PerfectNumber {
        public static void main(String[] args) {

            for(int i=1;i<=1000;i++)
            {
                int sum =0;
                for(int j=1;j<=i/2;j++)
                {
                    if(i%j==0)
                        sum += j;
                }
                if(sum==i)
                    System.out.println(i);
            }

    }

}
