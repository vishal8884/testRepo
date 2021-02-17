package csdojodatastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class targetArray {

	public static void main(String[] args) {

		int[] a = {-1,3,8,2,9,5};
		int[] b = {4,1,2,10,5,20};
		int[] c=closestSumPair(a,b,24);
		for(int i : c)
		{
			System.out.println(i);
		}
		
	}
	
	
	
	public static void target2(int[] a,int [] b, int t)
	{
		int x=0;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i: a)
		{
			set.add(i);
		}
		System.out.println(set);
		
		for(int i=0;i<b.length;i++)
		{
			
			
			x=t-b[i];
			if(set.contains(x))
			{
				System.out.println("hi");
				
			}
			System.out.println(x+" ::x");
		}
		
	}
	
	
	public static void target(int[] a,int [] b, int t)
	{
		int an=0,bn=0,sum=0,note=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum=a[i]+b[j];
				System.out.println("a[i] ::"+a[i]+"  a[j] ::"+b[j] +"   sum ::"+sum);
				if(sum==t)
				{
					an=a[i];
					bn=b[j];
				}
				else if(Math.abs(sum-t)<Integer.MAX_VALUE)
				{
					note=Math.abs(sum-t);
					an=a[i];
					bn=b[j];
				}
			}
		}
		
		System.out.println("a :"+an);
		System.out.println("b :"+bn);
		System.out.println("note :: "+note);
	}
	
	
	 public static int[] closestSumPair(int[] a1, int[] a2, int target) {
	        int[] a1Sorted = Arrays.copyOf(a1, a1.length);
	        Arrays.sort(a1Sorted);
	        int[] a2Sorted = Arrays.copyOf(a2, a2.length);
	        Arrays.sort(a2Sorted);

	        int i = 0;
	        int j = a2Sorted.length - 1;
	        int smallestDiff = Math.abs(a1Sorted[0] + a2Sorted[0] - target);
	        int[] closestPair = {a1Sorted[0], a2Sorted[0]};

	        while (i < a1Sorted.length && j >= 0 ) {
	            int v1 = a1Sorted[i];
	            int v2 = a2Sorted[j];
	            int currentDiff = v1 + v2 - target;
	            if (Math.abs(currentDiff) < smallestDiff) {
	                smallestDiff = Math.abs(currentDiff);
	                closestPair[0] = v1; closestPair[1] = v2;
	            }

	            if (currentDiff == 0) {
	                return closestPair;
	            }
	            else if (currentDiff < 0) {
	                i += 1;
	            }
	            else {
	                j -= 1;
	            }
	        }

	        return closestPair;
	    }

}
