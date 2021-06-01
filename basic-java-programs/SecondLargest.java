package BasicJavaPrograms;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {-5,-10,-6,4,-10,-4};
        int maximum= Integer.MIN_VALUE,secondMaximum = Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>maximum) {
                secondMaximum = maximum;
                maximum = i;
            }
            else if (i>secondMaximum)
                secondMaximum = i;
            System.out.println(secondMaximum);
        }
        System.out.println(maximum+" "+secondMaximum);
    }
}
