import java.util.Scanner;

class PalindromeNum
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number : ");
          int no = sc.nextInt();

          int temp = no;
          int rem,rev=0;

          while(temp != 0)
          {
              rem = temp % 10;
              rev = rev * 10 + rem;
              temp = temp / 10;
          }
          if(rev == no)
          {
              System.out.println("Palindrome Number");
          }
          else
          {
             System.out.println("Not Palindrome Number");
          }
     }
}