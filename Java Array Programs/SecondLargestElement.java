class SecondLargestElement
{
     public static void main(String[] args)
     {
          int arr[] = new int[]{10,40,50,20,30};
          int ar[] = new int[]{59,60,30,20,10,5,23};
          System.out.println("Second largest element is : "+getSecondLargest(arr,5));
           System.out.println("Second largest element is : "+getSecondLargest(ar,7));
     }
     static int getSecondLargest(int[] arr , int total)
     {
          int temp;
           
          for(int i=0; i<arr.length; i++)
          {
              for(int j=i+1; j<arr.length; j++)
              {
                   if(arr[i] > arr[j])
                   {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                   }
              }
          }
        return arr[total-2];
     }
}