import java.util.Scanner;

class FindSecondLargestElement
{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            System.out.print("How many element do you want to enter :");
              int n = sc.nextInt();

            int arr[] = new int[n];

           for(int i=0 ;i<n; i++)
           {
                arr[i] = sc.nextInt();
           }
           
             int temp;

             for(int i=0; i<arr.length; i++)
             {
                  for(int j=i+1; j<arr.length-1; j++)
                  {
                         if(arr[i] < arr[j])
                         {
                               temp = arr[i];
                               arr[i] = arr[j];
                               arr[j] = temp;
                         }
                  } 
             }
            System.out.println("The second largest element in given array is :"+arr[1]);
      }  
}