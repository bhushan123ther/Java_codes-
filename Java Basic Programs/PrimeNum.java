 import java.util.Scanner;

class PrimeNum
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number to check prime or not : ");
         int no = sc.nextInt();

         int temp = 0;
        
         for(int i=2; i<=no-1; i++)
         {
              if((no%i)==0)
              {
                   temp++;
              } 
                 
         }
         if(temp == 0 && no != 1)
         {
              System.out.println("Prime no");
         }
         else
         {
              System.out.println("Not Prime no");
         }
         
      }
}