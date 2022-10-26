class RemoveOneElement
{
     public static void main(String[] args)
     {
           int[] arr = {20,40,50,60,10,60,80,90};
           int element = 10;
           int count = 0;   

           for(int i=0; i<arr.length; i++)
           {
                 if(element == arr[i])
                 {
                      for(int j=i; j<arr.length-1; j++)
                      {
                           arr[j] = arr[j+1];
                      }
                      count = count + 1;
                      break;
                 }  
           }
           if(count == 0)
           {
                System.out.println("Element not found in an array");
           }
           else
           {
                System.out.println("Element deleted successfully");
           
                for(int i=0; i<arr.length-1; i++)
                {
                     System.out.print(arr[i]+" ");
                }
           }
     }
}