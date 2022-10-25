class PrintName1000
{
     public static void main(String[] args)
     {
           String s1 = "Hello World";
           String s2 = s1+s1;
           String s5 = s2+s2+s1;
           String s10 = s5+s5;
           String s50 = s10+s10+s10+s10+s10;
           String s100 = s50+s50;
           String s500 = s100+s100+s100+s100+s100;
           String s1000 = s500+s500;

       System.out.println(s1000+" ");
     }
}