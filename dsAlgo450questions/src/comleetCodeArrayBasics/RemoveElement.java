package comleetCodeArrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {3,2,2,3}; 
		 int val=3;
		 removeElement(arr,val);
		 
	}

	public static int removeElement2(int[] nums, int val) {
		 int i = 0;
		    int n = nums.length;
		    while (i < n) {
		        if (nums[i] == val) {
		            nums[i] = nums[n - 1];
		            // reduce array size by one
		            n--;
		        } else {
		            i++;
		        }
		    }
		    return n;
	}
	
	
	
	
	
	
	
	
	public static int removeElement(int[] nums, int val) {
	      
	       int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    
	    System.out.println(Arrays.toString(nums));
	    return i;
	    }
	


}






//static int deleteElement(int arr[], int n, int x) 
//{ 
//     //Search x in array 
//	int i; 
//	for (i=0; i<n; i++) 
//	{
//	    if (arr[i] == x) 
//	    {
//	    	System.out.println("found arr[i] ::"+arr[i]+"   i::"+i);
//	// If x found in array 
//	 
//	    // reduce size of array and move all 
//	    // elements on space ahead 
//	    n = n - 1; 
//	    for (int j=i; j<n; j++) 
//	    {
//	    	System.out.println("moved element arr[j] ::"+arr[j]+"    arr[j+1] :: "+arr[j+1]);
//	        arr[j] = arr[j+1];
//	        
//	    }
//	
//	    }
//	}
//	
//	return n; 
//  
//} 






//int len = arr.length,k=0;
//List<Integer> list = new ArrayList<Integer>();
//for(int i=0;i<arr.length;i++)
//{
//	if(arr[i]!=val)
//	{
//		list.add(arr[i]);
//	}
//}
//int[] temp = new int[list.size()];
//for(int e : list)
//{
//	temp[k++]=e;
//}
//
//Arrays.fill(arr, 0);
//for(int i=0;i<temp.length;i++)
//{
//	arr[i]=temp[i];
//}
//
//return list.size();