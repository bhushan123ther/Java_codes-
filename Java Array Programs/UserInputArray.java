import java.util.Scanner;

class UserInputArray
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("How many element do you want to enter in an array : ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter element : ");

         for(int i=0; i<n; i++)
         {
               arr[i] = sc.nextInt();
         }

       System.out.println("Array elements are : ");
 
        for(int i=0; i<n; i++)
        {
             System.out.print(arr[i]+" ");
        }
    }
}