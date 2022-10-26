class MergeTwoArray
{
     static void alternateMerge(int arr1[],int arr2[], int n1,int n2, int arr3[])
      {
                int i=0, j=0, k=0;
 
               // Traverse both array
                 while(i< n1 && j< n2)
                 {
                      arr3[k++] = arr1[i++];
                      arr3[k++] = arr2[j++];
                 }

               // store remaining elements of first array
                  while(i < n1)
                  {
                         arr3[k++] = arr1[i++];  
                  }

             // store remaining elements of second array
                while(j < n2)
                {
                       arr3[k++] = arr2[j++];
                }
      }

     public static void main(String[] args)
     {
           int arr1[]={10,12,14,16,18};
           int n1 = arr1.length;

           int arr2[]={11,13,15,17,19};
           int n2 = arr2.length;

           int arr3[] = new int[n1+n2];
           alternateMerge(arr1,arr2,n1,n2,arr3);

           System.out.println("Array after merging");
           for(int i=0; i<n1+n1; i++)
           {
                  System.out.println(arr3[i] + " ");
           }
     }
     
}