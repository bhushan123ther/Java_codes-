import java.util.Scanner;

class KthLargestElementUser
{
     public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many element do you want to enter : ");
       int n = sc.nextInt();

           int arr[] = new int[n];
           for(int i=0; i<n; i++)
           {
                arr[i] =  sc.nextInt();
           }

           System.out.println("Enter kth element to find : ");
           int k = sc.nextInt();

           for(int i=0; i<arr.length-1; i++)
           {
                 for(int j=i+1; j<arr.length; j++)
                 {
                       if(arr[i] < arr[j])
                       {
                              int temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                       }
                 }
                if(i == k-1)
                {
                     System.out.println("Kth largest element is : "+arr[i]);
                     break;
                }
           }
     }
}