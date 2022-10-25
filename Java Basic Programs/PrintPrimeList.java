import java.util.Scanner;

class PrintPrimeList
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first num : ");
         int first = sc.nextInt();

         System.out.print("Enter last num : ");
         int last = sc.nextInt();

         int temp;
         for(int no = first; no <= last; no++)
         {
             temp = 0;
             for(int i = 2; i <= no/2; i++)
             {
               // find remainder and check if it is equal to 0 or not
                  if(no % i == 0)
                  {
                     temp++;
                     break;
                  }
             }    
           
             if(temp == 0 && no != 1)
             {
                // print all the prime numbers
                 System.out.print(no+" ");
             }
         }
        System.out.println();
    }
}
