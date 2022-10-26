class RightShiftArray
{
     public static void main(String[] args)
     {
          int[] arr = {10,20,30,40,50};
          int n = 2;

          System.out.println("Original Array is : ");
          for(int i=0; i<arr.length; i++)
          {
               System.out.print(arr[i]+" ");
          }

          for(int i=0; i<n; i++)
          {
               int last = arr[arr.length-1];
               for(int j=arr.length-1; j>0; j--)
               {
                   arr[j] = arr[j-1];
               }
              arr[0] = last;
          }
        System.out.println();

        System.out.println("Array after rotation : ");
        for(int i=0; i<arr.length; i++)
        {
             System.out.print(arr[i]+" ");
        }
     }
}