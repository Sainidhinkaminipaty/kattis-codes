import java.util.Scanner;
import java.math.*;
public class Main
{
   public static void main(String[] args) 
    {
        int n,k,m;
        Scanner s = new Scanner(System.in);
        System.out.print(" ");
        n = s.nextInt();
        k = s.nextInt();
        if(n!=0 && k!=0 && n==k)
        {
          m=2*n;
          System.out.println("Even "+m);
        }  
        else if(n==0 && k==0)  
        {
          System.out.println("Not a moose");
        }
        else if(n==0 && k!=0)
        {
          System.out.println("Odd "+k);
        }
        else if(n!=0 && k==0)
        {
          System.out.println("Odd "+n);
        }
        else
        {
          m=(n+k+1)/2;
          System.out.println("Odd "+m);
        }
    }
}