package BasicJavaPrograms;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        for (long original = 1; original <= 10000; original++)
        {
            long ip =  original;
            long counter = 0;
            int length = String.valueOf(ip).length();
            if(length<2)
            {
               counter = original;
            }
            else
                {
                int[] arr = new int[length];
                for (int i = 1; i <= length; i++)
                {
                    arr[length - i] = (int) ip % 10;
                    ip /= 10;
                }
                for (int j : arr)
                {
                    counter += Math.pow(j,length);
                }
            }
            if (original == counter)
            {
                System.out.println("Yes " + original + " is Armstrong");
            }
        }
    }
}
