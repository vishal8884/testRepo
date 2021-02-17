package com.Arrays;

import java.util.Arrays;

public class MoveNegetiveNumbersOneSide {

	public static void main(String[] args) {

		int[] arr= {-2,3,-1,-4,8,9,12};
		int[] op=moveNegNo(arr);
		
		System.out.println(Arrays.toString(op));
		
		rearrange(arr,arr.length);
	}
	
	public static int[] moveNegNo(int[] arr)
	{
		int neg=0,j=0,pos=0,k=0;
		for(int i=0;i<arr.length;i++)  //this loop is used to detect length of neg and pos array
		{
			if(arr[i]<0)
				neg++;
			else
				pos++;
		}
		int[] negarr= new int[neg];
		int[] posarr = new int[pos];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negarr[j]=arr[i]; //puts all neg numbers in negarr
				j++;
			}
			else
			{
				posarr[k]=arr[i]; //puts all pos numbers in pos array
				k++;
			}
		}
		
		int[] op = new int[pos+neg];  //output array
		System.arraycopy(negarr, 0, op, 0, neg);
		System.arraycopy(posarr, 0, op, neg, pos);
		return op;
	}
	
	static void rearrange(int arr[], int n)  //this method of geeks of geeks for same question
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
	
//	public static void moveNegNo(int[] arr)
//	{
//		int neg=0,j=0,pos=0,k=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<0)
//				neg++;
//			else
//				pos++;
//		}
//		
//		System.out.println(neg +"  :: neg    " +pos +"  ::pos");
//		int[] negarr= new int[neg];
//		int[] posarr = new int[pos];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<0)
//			{
//				negarr[j]=arr[i];
//				j++;
//			}
//			else
//			{
//				posarr[k]=arr[i];
//				k++;
//			}
//		}
//		
//		int[] op = new int[pos+neg];
//		
//		System.arraycopy(negarr, 0, op, 0, neg);
//		System.arraycopy(posarr, 0, op, neg, pos);
//		
//
//		for(int i : op)
//		{
//			System.out.print(i+" ");
//		}
//		
//	}

}
