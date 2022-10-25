import java.util.Scanner;

class SumOfDigit
{
      public static void main(String[] args)
      {
         int sum = 0 , rem;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number : ");
         int no = sc.nextInt();
       
         while(no > 0)
         {
              rem = no % 10;
              sum = sum + rem;
              no = no /10;
         }
         System.out.println("Sum of all individual digits is : "+sum);
      }
}