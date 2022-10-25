import java.util.Scanner;

class PalindromeNumRange
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first number : ");
          int num1 = sc.nextInt();

          System.out.println("Enter last number : ");
          int num2 = sc.nextInt();

          for(int i=num1; i<=num2; i++)
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
             
                  System.out.println(" "+rev);
             
           }
     }
}