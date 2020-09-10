import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args)
  {
    int x,m;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    if(x<4)
    {
      System.out.println(" "+x);
    }
    else
    {
      m=x-2;
      System.out.println(" "+m);
    }
  }
}