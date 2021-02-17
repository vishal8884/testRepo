package com.Arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;


public class UnionOfTwoArrays {

	public static void main(String[] args) {

		int[] a = {4,3,1};
		int[] b = {9,3,4};
		
		int[] op =getUnion(a,b);
		System.out.println(Arrays.toString(op)+"  ::union of a and b");
		
		int[] x = {1,2,3,2,3,5};
		System.out.println(Arrays.toString(removeDuplicates(x)) +"  :: removed dublicates");
		
	}
	
	
	 public static int[] getUnion(int[] a , int[] b)
	 {
		 
		 int[] addedarr = addTwoArrays(a,b);
		 System.out.println(Arrays.toString(addedarr)+" :: addedarrr");
		 int[] op = removeDuplicates(addedarr);
		 
		 return op;
		 
		
	 }
	 
	 public static int[] addTwoArrays(int[] a,int[] b)
	 {
		 int[] narr = new int[a.length+b.length];
		 int j=0;
		 for(int i=0;i<a.length;i++)
		 {
			 narr[i]=a[i];
		 }
		 
		 for(int i=a.length;i<narr.length;i++)
		 {
			 narr[i]=b[j];
			 j++;
		 }
		 return narr;
	 }
	 
	 
	 
	 
	 public static int[] removeDuplicates(int[] nums) {
		 

		Set<Integer> set = new HashSet<>(); 
		for (int t : nums) { 
		    set.add(t); 
		} 
		
		int n = set.size(); 
		int arr[] = new int[n]; 
		
		int i = 0; 
		for (int x : set) 
		{
		    arr[i]=x;
		    i++;
		}
		return arr; 

		}
	 
	 
	 public void splitArrEqually(int[] arr , int alen ,int blen)
	 {
		 
	 }
	 
	 

}







//Set<Integer> set = new HashSet<>(); 
//for (int t : nums) { 
//    set.add(t); 
//} 
//
//int n = set.size(); 
//int arr[] = new int[n]; 
//
//int i = 0; 
//for (int x : set) 
//{
//    arr[i]=x;
//    i++;
//}
//return arr; 





//System.out.println("narr[i] :: "+narr[i]+"     narr[j] :: "+narr[j]);