import java.util.Scanner;

class ArmstrongNum
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong number or not : ");
        int no = sc.nextInt();

        int temp = no;

        int rev = 0 , rem;
        
        while(temp != 0)
        {
             rem = temp % 10;
             rev = rev + (rem*rem*rem);
             temp = temp/10;
        }
       if(no == rev)
       {
            System.out.println("Armstrong Number");
       }
       else
       {
            System.out.println("Not Armstrong Number");
       }
    }
}