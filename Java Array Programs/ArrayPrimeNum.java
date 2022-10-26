/*
class ArrayPrimeNum
{
    public static void main(String[] args)
    {
          int[] arr = {2,3,4,5,6,7,8};
          
          for(int i = 0; i<arr.length; i++)
          {
              boolean isPrime = true;

              if(arr[i] == 1)
              
                  isPrime = false;
              
              else
              {
                   for(int j = 2; j<= arr[i] /2; j++)
                   {
                         if(arr[i] % j == 0)
                         {
                             isPrime = false;
                             break;
                         }
                   }
              }
             if (isPrime)
             {
                   if (arr[i] == 0){}
                   else 
                   {
                     System.out.print(arr[i] + " ");   
                   }
             }

          }             
          
    }
}

*/
/*

import java.util.Scanner;

public class PrimeNumbers
{ 
   public static void main (String[] args)
   {
       int[] array = new int [5];
       Scanner in = new Scanner (System.in);
    
       System.out.println("Enter the elements of the array: ");
       for(int i=0; i<5; i++)
       {
            array[i] = in.nextInt();
       }
      //loop through the numbers one by one
       for(int i=0; i<array.length; i++)
       {
             boolean isPrime = true;
        
            //check to see if the numbers are prime
           for (int j=2; j<array[i]; j++)
           { 
             if(array[i]%j==0)
             {
                isPrime = false;
                break;
             }
           }
        //print the number
        if(isPrime)

            System.out.println(array[i] + " are the prime numbers in the array ");
    }
}
}

*/

class ArrayPrimeNum
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