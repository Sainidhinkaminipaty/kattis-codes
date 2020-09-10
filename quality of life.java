import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
public class Main
{
   public static void main(String[] args) 
{
 int m,i;
 double c=0;
 Scanner s = new Scanner(System.in);
 m = s.nextInt();
 double a[] = new double[m];
 double b[] = new double[m];
 for(i = 0; i<m; i++)
    {
      a[i] = s.nextDouble();
      b[i] = s.nextDouble();
       c=c+a[i]*b[i];
    }
    System.out.println(" "+c);
    }
    }    