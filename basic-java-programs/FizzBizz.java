package BasicJavaPrograms;

public class FizzBizz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            String s="";
            if(i%5==0)
            {
                s=s+"Bizz";
            }
            if(i%3==0)
            {
                s=s+"Fizz";
            }
            else
                s=Integer.toString(i);
            System.out.println(s);
        }
    }

}
