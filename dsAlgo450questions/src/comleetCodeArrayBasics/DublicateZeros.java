package comleetCodeArrayBasics;

import java.util.Arrays;

public class DublicateZeros {

	public static void main(String[] args) {

		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
//		shiftElementByOne(arr,2);
	}
	
	public static void shiftElementByOne(int[] arr, int index)
	{
		for(int i = arr.length-2;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=0;
		System.out.println("shiftElementByOne :: "+Arrays.toString(arr));
	}

	public static void duplicateZeros(int[] arr) {

		int noted=0;
		System.out.println("before start :: "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				shiftElementByOne(arr,i);
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr)+"   ::op");
	}
	
	
}
