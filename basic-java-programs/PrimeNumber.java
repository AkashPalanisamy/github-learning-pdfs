package BasicJavaPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int overall=0;
        for(int i =2;i<=100;i++)
        {
            int count=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if (count<2)
            {
                System.out.println(i);
                overall++;
            }
        }
        System.out.println("The overall count of Prime-numbers is "+ overall);

    }
}
