import java.io.*; 
import java.util.Scanner;
import java.math.*;
import java.io.InputStream;
class Main 
{ 
static double calculatePercentage(int r, int c) 
{ 
	// Declare value of pi 
	double pi = 3.1415926536; 

	// Calculate area of outer circle 
	double arr = pi * r * r; 

	// Calculate area of inner circle 
	double arc = pi * c * c; 
	// Percentage of cheese
	return arc/arr*100; 
} 

// Driver code
public static void main (String[] args) 
{ 
  System.out.println(" "+" ");
  Scanner sc = new Scanner(System.in);
  int r = sc.nextInt();  
  int x = sc.nextInt();
  int c = r-x;
  System.out.println(calculatePercentage(r,c)); 
} 
} 


