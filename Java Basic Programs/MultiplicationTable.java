import java.util.Scanner;

class MultiplicationTable
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter number to print multiplication table : ");
          int no = sc.nextInt();

          int mul=1;
          for(int i=1; i<=10; i++)
          {
              mul = no*i;
             System.out.println(no+"x"+i+" = "+mul);
          }
     }
}