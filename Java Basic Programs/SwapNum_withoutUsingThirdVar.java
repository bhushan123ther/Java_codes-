class SwapNum_withoutUsingThirdVar
{
    public static void main(String[] args)
    {
         int no1=10 , no2=20;
         System.out.println("Before swapping : "+no1+" "+no2);
         no1 = no1+no2;
         no2 = no1-no2;
         no1 = no1-no2;
         System.out.println("After swapping : "+no1+" "+no2);   
    }
}