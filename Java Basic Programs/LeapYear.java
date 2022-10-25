import java.util.Scanner;

/* // First way

class LeapYear
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter year to check leap year or not : ");
          int year = sc.nextInt();
          
          if(year%4 == 0 || (year % 400 == 0 && year % 100 != 0))
          {
                System.out.println("Leap year");     
          }
          else
          {
                System.out.println("Not Leap year");
          }
     }
}

*/
// second way

class LeapYear
{
       public static void main(String[] args)
       {
            Scanner sc = new Scanner(System.in);
             System.out.println("Enter year to check leap year or not : ");
             int year = sc.nextInt();

              if(year % 4 == 0)
              {
                     if(year % 100 != 0)
                     {
                         if(year % 400 == 0)
                         {
                              System.out.println("Leap Year");
                         }
                         else
                         {
                              System.out.println("Not Leap Year");
                         }
                      }
                      else
                      {
                            System.out.println("Leap year");
                      }
              }
              else
              {
                  System.out.println("Not leap year..");
              }
       }
}