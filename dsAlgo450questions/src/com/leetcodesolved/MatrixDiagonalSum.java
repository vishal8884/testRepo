package com.leetcodesolved;

public class MatrixDiagonalSum {

	public static void main(String[] args) {

		int[][] mat =  {{1,1,1,1},
		                {1,1,1,1},
		                {1,1,1,1},
		                {1,1,1,1}};
		
		diagonalSum(mat);
	}
	
	
	   public static int diagonalSum(int[][] arr) {
		
		   int sum=0,sum2=0,k=0,l=arr.length-1,totalsum=0;
		   int n=arr.length-1;
		   int center=arr.length/2;
		   for(int i=0;i<arr.length;i++)
		   {
			   sum=sum+arr[i][i];
			   sum2=sum2+arr[k][l];
			   System.out.println(sum2+" sum2");
			   k++;
			   l--;
		   }
		   if(arr.length%2!=0)
		   totalsum=sum+sum2-arr[center][center];
		   else {
			   System.out.println("inside else");
			   totalsum=sum+sum2;	
		   }
			      
		   System.out.println("total sum ::"+totalsum);
		   return 0;
	    }

}


//if(Math.abs(i-j)==n)
//{
//	   System.out.println("i ::"+i+"  j::"+j);
//}


//
//int[][] mat =  {{1,2,3,4,5},
//        {6,7,8,9,10},
//        {11,12,13,14,15},
//        {16,17,18,19,20},
//        {21,22,23,24,25}};