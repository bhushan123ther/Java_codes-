import java.util.Scanner;

class FactorialRecursion
{
    static int fact = 1;
    public static void main(String[] args)
    {
       int n = 5;
       FactorialRecursion obj = new FactorialRecursion();
          obj.factFind(n);
       System.out.println(fact);
    }
    void factFind(int n)
    {
        if(n >= 1)
        {
               fact = fact * n;
               factFind(n-1);
        }
    }
}