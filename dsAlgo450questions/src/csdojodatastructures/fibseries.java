package csdojodatastructures;

public class fibseries {

	public static void main(String[] args) {

		//System.out.println(fib(5)+" op");
		int n = 9; 
	    System.out.println(fib(n)); 
	}
	
	
	static int fib(int n) 
    { 
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
    } 
       
    return  f[n]; 
    } 
	
	public static int fib2(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib2(n-1) + fib2(n-2); 
    } 
       
    

}
