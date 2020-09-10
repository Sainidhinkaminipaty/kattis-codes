import java.util.*; 
import java.util.Scanner;
import java.math.*;

class Main { 
static final int BITS = 32; 
static int MaxSubarrayXOR(int set[], int n) 
{  
	int c = 0;  
	for (int i = BITS - 1; i >= 0; i--) 
	{ 
	int maxInd = c; 
	int maxEle = Integer.MIN_VALUE; 
	for (int j = c; j < n; j++) { 
		if ((set[j] & (1 << i)) != 0 && set[j] > maxEle) 
		{ 
		maxEle = set[j]; 
		maxInd = j; 
		} 
	} 
 
	if (maxEle == -2147483648) 
		continue;  
	int temp = set[c]; 
	set[c] = set[maxInd]; 
	set[maxInd] = temp; 
	maxInd = c; 

	for (int j = 0; j < n; j++) { 
		if (j != maxInd && (set[j] & (1 << i)) != 0) 
		set[j] = set[j] ^ set[maxInd]; 
	} 
	c++; 
	} 

	int res = 0; 
	for (int i = 0; i < n; i++) 
	res ^= set[i]; 
	return res; 
} 

// Driver code 
public static void main(String arg[]) {
  int n,i; 
	Scanner s=new Scanner(System.in);
  System.out.println();
  n=s.nextInt();
  int set[]=new int[n];
  System.out.println();
  for(i=0;i<n;i++)
  {
    set[i]=s.nextInt();
  }
	n = set.length; 

	System.out.print(" "); 
	System.out.print(MaxSubarrayXOR(set, n)); 
} 
} 

