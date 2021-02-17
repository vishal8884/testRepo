package com.leetcodesolved;

public class SumOddLenSubArrays {

	public static void main(String[] args) {

		int[] arr= {1,4,2,5,3};
//		int[] arr= {1,2,3,-2,5};
		sumOddLengthSubarrays(arr);
	}

	public static int sumOddLengthSubarrays(int[] arr) {

		
		int sum=0,sum2=0,c=0,iandj=0,max=0;
		for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					iandj=i+j;
					if(iandj<=arr.length-1)
					{
					sum=sum+arr[iandj]; 
					 if(j%2==0 || j==0)
					 {
						 sum2=sum2+sum;
					 }
					System.out.println("i ::"+i+" j :: "+j+"   arr[i] ::"+arr[i]+"   sum :: "+sum +"   arr[i+j] :: "+arr[iandj]+"     sum2::"+sum2);
					}
					
				}
				System.out.println();
				sum=0;
			}
		return -1;
	}
	
	
	
	public int sumOddLengthSubarrays2(int[] arr) {
		int ans = 0;
        for(int i=0;i < arr.length; i++)
            ans += ((((arr.length-i) * (i+1)) + 1 )/2) * arr[i];
        return ans;    
		}

}






//System.out.println("arr[i] :: "+arr[i]+"     arr[j] ::"+arr[j]);
//
//int sum=0,sum2=0,c=0;
//for(int i=0;i<arr.length;i++)
//{
//	sum=sum+arr[i];
//	
//}
//
//for(int j=0;j<arr.length;j++)
//{
//	sum2=sum2+arr[j];
//	c++;
//	System.out.println("sum2 :: "+sum2+"   c:: "+c +"  arr[j] :: "+arr[j]);
//}
//
//if(arr.length%2!=0)
//{
//	sum=sum*2;
//}
//System.out.println("sum 1 :: "+sum +"    sum2 ::"+sum2);