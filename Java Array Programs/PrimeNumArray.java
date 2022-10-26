class PrimeNumArray
{
    public static void main(String[] args)
    {
          int[] arr = {31,2,3,4,23,2,19,20};
          int flag = 0;

          for(int i=0; i<arr.length-1; i++)
          {
               if((arr[i]!=0) && (arr[i]!=1))
               {
                     for(int j=2; j<arr[i]; j++)
                     {
                          if(arr[i]%j == 0)
                          {
                               flag = 1;
                               break;                           
                          }
                     }
                  if(flag == 0)
                  {
                       System.out.println(arr[i]+" : prime number ");
                  }
               }
          }
    }
}