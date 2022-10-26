/*
        1 2 3 4 5
        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
        5 6 7 8 9

*/

class Pattern4
{
      public static void main(String[] args)
      {
           int i,j;
           for(i=1; i<=5; i++)
           {
                for(j=i; j<i+5; j++)
                {
                      System.out.print(j+" ");
                }
              System.out.println();
           }
      }
}