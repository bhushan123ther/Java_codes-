class DuplicateEleArray
{
     public static void main(String[] args)
     {
          int[] arr = {2,3,4,5,3,2,6,7,8,6,5,7,9,34,4};
    
          int count = 0;
          for(int i=0; i<arr.length; i++)
          {
              for(int j=i+1; j<arr.length; j++)
              {
                   if(arr[i] == arr[j])
                   {
                        count++;
                        System.out.println(arr[j]);
                   }
              }
          }
         System.out.println("There are "+count+" duplicate elements in an array ");
     }
}