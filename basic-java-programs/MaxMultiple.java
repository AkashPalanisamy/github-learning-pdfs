package BasicJavaPrograms;
public class MaxMultiple {

    /*    Variable Declaration     */
    int maximum= Integer.MIN_VALUE,secondMaximum = Integer.MIN_VALUE;
    int minimum= Integer.MAX_VALUE,secondMinimum= Integer.MAX_VALUE;
    static int max_multiple;

    /*    Main Function     */
    public static void main(String[] args)
    {
        MaxMultiple obj = new MaxMultiple();
        int[] arr = {5,-6,-10,4};
        max_multiple = obj.maxvalue(arr);
        if(max_multiple!=0)
        System.out.println("The max multiple is : "+max_multiple);
    }

    /*    Calling Function     */
    int maxvalue(int[] arr)
    {
        if(arr.length>2) {
            for (int i : arr) {
                if (i > maximum) {
                    secondMaximum = maximum;
                    maximum = i;
                } else if (i > secondMaximum)
                    secondMaximum = i;
                if (i < minimum) {
                    secondMinimum = minimum;
                    minimum = i;
                } else if (i < secondMinimum)
                    secondMinimum = i;
            }
            max_multiple = Math.max((maximum*secondMaximum),(minimum*secondMinimum));
            return max_multiple;
        }
        if(arr.length==2)
        {
            max_multiple = arr[0]*arr[1];
            return  max_multiple;
        }
        else
        {
            System.out.println("Array has only 1 element ");
            return 0;
        }
    }
}
