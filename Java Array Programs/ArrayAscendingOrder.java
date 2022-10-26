class ArrayAscendingOrder
{
      public static void main(String[] args)
      {
            int[] arr = {50,30,10,20,60,40,70};
  
            int temp;

            for(int i=0; i<arr.length; i++)
            {
                 for(int j=0; j<arr.length-1; j++)
                 {
                     if(arr[j] > arr[j+1])
                     {
                          temp = arr[j];
                          arr[j] = arr[j+1];
                          arr[j+1] = temp;
                     }
                 }
            }
           for(int i=0; i<arr.length; i++)
           {
                 System.out.print(arr[i]+" ");
           }
      }
}