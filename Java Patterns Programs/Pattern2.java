/*

 * * * * * * 
 * 1 2 3 4 *
 * 1 2 3 4 *          
 * 1 2 3 4 *        
 * 1 2 3 4 *          
 * * * * * * 

*/
class Pattern2
{
     public static void main(String[] args)
     {
          for(int i=1; i<=6; i++)
          {
              for(int j=1; j<=6; j++)
              {
                   if(i==1 || j==1 || i==6 || j==6)
                   {
                       System.out.print("* ");
                   }
                   else
                   {
                       System.out.print(j-1+" ");
                   }
              }
            System.out.println();
          }
     }
}