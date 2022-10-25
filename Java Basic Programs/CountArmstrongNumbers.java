import java.util.Scanner;

class CountArmstrongNumbers
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number : ");
         int n1 = sc.nextInt();

         System.out.println("Enter second number : ");
         int n2 = sc.nextInt();

         int count = 0;
         for(int i=n1 ; i<=n2; i++)
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
                 count++;
             }
         }
         System.out.println("Total Armstrong number is : "+count);
     }
}