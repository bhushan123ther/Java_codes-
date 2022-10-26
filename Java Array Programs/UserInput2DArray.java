import java.util.Scanner;

class UserInput2DArray
{
    public static void main(String[] args)
    {
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        m = sc.nextInt();

        System.out.println("Enter the number of colums : ");
        n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter elements : ");

        for(i=0; i<m; i++)
        {
           for(j=0; j<n; j++)
           {
             arr[i][j] = sc.nextInt();
           }
        }
       
       System.out.println("Array elements are : ");

        for(i=0; i<m; i++)
        {
           for(j=0; j<n; j++)
           {
                System.out.print(arr[i][j]+" ");
           }
         System.out.println();
        }
    }
}
