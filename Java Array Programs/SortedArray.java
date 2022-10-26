class SortedArray
{
     public static void main(String[] args)
     {
          int[] arr = {60,10,90,20,70,30,40,50};
          
          System.out.println("Array before sorting : ");

          for(int i=0; i<arr.length; i++)
          {
               System.out.print(arr[i]+" ");
          }
          System.out.println();
          System.out.println("Array after sorting : ");

          for(int i=0; i<arr.length; i++)
          {
               for(int j=i+1; j<arr.length; j++)
               {
                     if(arr[i] > arr[j])
                     {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                     }
               }
              System.out.print(arr[i]+" ");
          }
     }
}
