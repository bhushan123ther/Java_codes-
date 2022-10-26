import java.util.HashSet;

class RemoveDuplicateEle_Using_HashSet
{
      public static void main(String[] args)
      {
            int[] arr = {1,2,3,3,1,4,4,5,7,6,7};
         
            HashSet<Integer> hs = new HashSet<Integer>();

            System.out.println("Elements in an arrays is :");

            for(int i=0; i<arr.length; i++)
            {
                 hs.add(arr[i]);
            }
            for(int no : hs)
            {
                 System.out.println(no+" ");
            }
      }
}