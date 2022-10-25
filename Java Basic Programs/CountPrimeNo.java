import java.util.Scanner;

class CountPrimeNo
{
      public static void main(String[] args)
      {
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int first = sc.nextInt();

            System.out.println("Enter last number : ");
            int last = sc.nextInt();

            int count = 0;

            for(int i=first; i<=last; i++)
            {
                int n = i;
                int temp = 0;
                int a = 2;

                while(a <= (n/2))
                {
                     if((n%a)==0)
                     {
                         temp++;
                         break;
                     }
                   a++;
                }     
                if(temp == 0 && i != 1)
                {
                     count++;
                }          
            }    
           System.out.println("Total number of prime number is : "+count);
      }
}