nimport java.util.Scanner;

class PalindromeNumArray
{
     public static void main(String[] args)
     {
         int[] arr = {1,123,121,456,565};

          for(int i=0; i<=arr.length; i++)
          {
             int temp = i;

             int rem,rev=0;
             while(temp != 0)
             {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
             }
             if(rev == i)
             {
                   System.out.println(rev);
             }
           }
       
     }
}