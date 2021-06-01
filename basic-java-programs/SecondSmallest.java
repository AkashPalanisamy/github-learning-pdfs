package BasicJavaPrograms;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {-5,-10,-6,4};
        int minimum= Integer.MAX_VALUE,secondMinimum= Integer.MAX_VALUE;
        for(int i:arr)
        {
            if(i<minimum)
            {
                secondMinimum = minimum;
                minimum = i;
            }
            else if(i<secondMinimum)
            {
                secondMinimum = i;
            }
        }
        System.out.println(minimum+" "+secondMinimum);
    }
}
