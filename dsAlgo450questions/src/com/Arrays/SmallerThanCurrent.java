package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallerThanCurrent {

	public static void main(String[] args) {

		int[] arr = { 8, 1, 2, 2, 3 };
		smallerNumbersThanCurrent(arr);
	}

	public static int[] smallerNumbersThanCurrent(int[] arr) {
         
		int c=0,x=0;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
			{
			     c=0;
				for(int j=0;j<arr.length;j++)
				{
					if((i!=j) && (arr[i]>arr[j]))
					{
							c++;
							System.out.println("i ::"+i+"   j::"+j+"   c::"+c);
					}
				}
				list.add(c);
				
			}
		
		System.out.println(list);
		int[] op = new int[arr.length];
		for(int i : list)
		{
			op[x]=i;
			x++;
		}
		
		System.out.println(Arrays.toString(op));
	return op;
}

}

//if(arr[i]>arr[j])
//{
//	c++;
//	System.out.println("i ::"+i+"   j::"+j+"   c::"+c);
//	
//}