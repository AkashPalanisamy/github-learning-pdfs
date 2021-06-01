public class MaxMultiple {
    public static void main(String[] args) {
        int[] arr = {5,-10,-6,4};
        int oNotationCounter = 0;
        int maximum= Integer.MIN_VALUE,secondMaximum = Integer.MIN_VALUE;
        int minimum= Integer.MAX_VALUE,secondMinimum= Integer.MAX_VALUE;
        int max_multiple;
        for(int i:arr)
        {
            {
                if (i > maximum) {
                    secondMaximum = maximum;
                    maximum = i;
                }
                else if (i > secondMaximum)
                    secondMaximum = i;
            }
            {
                if (i < minimum) {
                    secondMinimum = minimum;
                    minimum = i;
                }
                else if (i < secondMinimum) {
                    secondMinimum = i;
                }
            }
            oNotationCounter ++;
        }
        max_multiple = Math.max((maximum*secondMaximum),(minimum*secondMinimum));
        System.out.println("The max multiple is : "+max_multiple);
        System.out.printf("O[%d]",oNotationCounter);
    }
}