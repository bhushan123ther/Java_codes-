import java.util.Scanner;

class SumOfNaturalNum
{
       public static void main(String[] args)
       {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any natural number : ");
            int no = sc.nextInt();

            int sum = 0;

            for(int i=0; i<=no; i++)
            {
                 sum = sum + i;
            }
            System.out.println("The sum of natural number is : "+sum);
       }
}