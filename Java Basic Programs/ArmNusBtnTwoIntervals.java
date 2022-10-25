import java.util.Scanner;

class ArmNusBtnTwoIntervals
{
      public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first number : ");
          int n1 = sc.nextInt();
          System.out.println("Enter the second number : ");
          int n2 = sc.nextInt();

          System.out.println("Armstrong numbers are :");

          for(int i=n1; i<=n2; i++)
          {
               int temp = i;
               int rev = 0;

               while(temp > 0)
               {
                   int rem = temp % 10;
                   rev = rev + (rem*rem*rem);
                   temp = temp/10;
               }
             if(rev == i)
               System.out.println(" "+rev);
          }

     }
}