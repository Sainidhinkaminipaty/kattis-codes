import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      String s1, s2;
      Scanner in = new Scanner(System.in);
     
      System.out.println();
      s1 = in.nextLine();
     
      System.out.println();
      s2 = in.nextLine();
     
      if (s1.compareTo(s2) > 0)
         System.out.println("no");
      else if (s1.compareTo(s2) < 0)
         System.out.println("go");
      else  
         System.out.println("go");
   }
}