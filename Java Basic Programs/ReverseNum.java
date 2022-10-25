import java.util.Scanner;

class ReverseNum
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number : ");
         int no = sc.nextInt();

         int rem , rev = 0;
         int temp = no;

         while(temp !=0 )
         {
             rem = temp % 10;
             rev = rev * 10 + rem;
             temp = temp / 10;
         }
        System.out.println(" Reverse of "+no+" is : "+rev);
    }
}