class Pattern7
{
       public static void main(String[] args)
       {
             for(int i=15; i>=11; i--)
             {
                   for(int j=i; j>=11; j--)
                   {
                         System.out.print(j+" ");
                   }
                 System.out.println();
             }
       }
}

/*

15 14 13 12 11
14 13 12 11
13 12 11
12 11
11

*/