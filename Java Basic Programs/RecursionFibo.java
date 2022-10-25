class RecursionFibo
{
     static int a = 0, b = 1 , c;
     public static void main(String[] args)
     {
           System.out.print(a+" "+b);
           RecursionFibo obj = new RecursionFibo();
           obj.fibo(10);   
     }
     void fibo(int n)
     {
           if(n > 0)
           {
               c = a+b;
               System.out.print(" "+c);
               a = b;
               b = c;
               fibo(n-1);
           }
     }
   
}