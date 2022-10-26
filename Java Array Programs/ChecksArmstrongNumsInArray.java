import java.util.Scanner;

class ChecksArmstrongNumsInArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,153,23,456,87};
        
         for(int i=0; i<arr.length; i++)
         {
              int rem , rev = 0;
              int temp = i;

              while(temp > 0)
              {
                   rem = temp % 10;
                   rev = rev + (rem * rem * rem);
                   temp = temp / 10;
              }
             if(rev == i)
             {
                  System.out.println(" "+arr[rev]);
             }
         }
        
    }
}