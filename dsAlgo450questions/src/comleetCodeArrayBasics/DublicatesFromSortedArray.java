package comleetCodeArrayBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DublicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {0,0,1,1,1,2,2,3,3,4,4};
        removeDuplicates(arr);
	}
	
	
	public static int removeDuplicates(int[] arr) {
	      
		int n=arr.length;
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
			
		}
		arr[j++]=arr[n-1];
		System.out.println(Arrays.toString(arr));
		return -1;
    }  
	
	static void deleteElement(int arr[], int n, int x) 
	{ 
	     //Search x in array 
		int i; 
		for (i=0; i<n; i++) 
		{
		    if (arr[i] == x) 
		    {
		    	System.out.println("found arr[i] ::"+arr[i]+"   i::"+i);
		// If x found in array 
		 
		    // reduce size of array and move all 
		    // elements on space ahead 
		    n = n - 1; 
		    for (int j=i; j<n; j++) 
		    {
		    	System.out.println("moved element arr[j] ::"+arr[j]+"    arr[j+1] :: "+arr[j+1]);
		        arr[j] = arr[j+1];
		        
		    }
		
		    }
		}
		
	  
	} 
}



































//Set<Integer> set = new HashSet<>();
//for (int t : nums) {
//	set.add(t);
//}
//
//int n = set.size();
//int arr[] = new int[n];
//
//int i = 0;
//for (int x : set) {
//	arr[i] = x;
//	i++;
//}
//
//Arrays.sort(arr);
// 
//for(int f=0;f<arr.length;f++)
//{
//	nums[f]=arr[f];
//	System.out.println(nums[f]);
//}
//    
//
//
//return arr.length;