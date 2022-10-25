import java.util.Scanner;

class SumOfArmstrongNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number : ");
          int n1 = sc.nextInt();

         System.out.println("Enter last number : ");
           int n2 = sc.nextInt();

         int sum = 0;
         for(int i=n1; i<=n2; i++)
         {
             int temp = i;
             int rev = 0;

             while(temp > 0)
             {
                 int rem = temp % 10;
                 rev = rev + (rem*rem*rem);
                 temp = temp / 10;
             }
             if(rev == i)
             {
                   sum = sum + rev;
                   
             }
         } 
         System.out.println("The sum of all Armstrong number is : "+sum);
    }
}