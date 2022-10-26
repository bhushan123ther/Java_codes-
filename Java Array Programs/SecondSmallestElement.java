class SecondSmallestElement
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,4,9,2,6,1};

        System.out.println("Second smallest element in an array is : "+getSecondSmallest(arr,6));
    }
    static int getSecondSmallest(int[] arr , int total)
    {
          int temp ;
          for(int i=0; i<total; i++)
          {
              for(int j=i+1; j<total; j++)
              {
                  if(arr[i] > arr[j])
                  {
                       temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                  }
              }
          }
        return arr[1];
    }
  
}