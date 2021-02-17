package com.leetcodesolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minClimbingStairs {

	public static void main(String[] args) {

		//int[] arr = {0,0,2,1};
		int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		//int[] arr = {10,15,20};
		
		minCostClimbingStairs(arr);
	}
	
    public static int minCostClimbingStairs(int[] cost) {
     
    	
    	int f1 = cost[0], f2 = cost[1];
        for (int i = 2; i < cost.length; i++) {
          int f_current = cost[i] + Math.min(f1, f2);
          f1 = f2;
          f2 = f_current;
          
          System.out.println("f1 :: "+f1+"     f2 :: "+f2 +"      i::"+i);
        }
        
        System.out.println(Math.min(f1, f2));
        return Math.min(f1, f2);
    }
    
    
    
    
    
//    && cost[i+1]<=cost[i+2]
    
    
    
    
    
    
    
    
    
    
    
//    public static int minCostClimbingStairs(int[] cost) {
//        
//    	List<Integer> f = new ArrayList<Integer>();
//    	int sum=0,c=0;
//    	for(int i=0;i<cost.length-1;i++)
//    	{
//
//    		 if(i>0 && cost[i]>cost[i-1] && cost[i]<cost[i+1])
//    		 {
//    			 sum=cost[i];
//    			 System.out.println("sum inside 1 ::"+sum);
//    		 }
//    		 else
//    		 {
//    		 if(cost[i]<=cost[i+1])
//             {
//            	 System.out.println(cost[i]+"     index:: "+i+"   "+cost[i+1]+"     index:: "+i);
//            	 f.add(cost[i]);
//            	 sum=sum+cost[i];
//            	 System.out.println("sum ::"+sum);
//            	 System.out.println("inside 2");
//             }
//    		 }
//    	}
//    	
//    	System.out.println(f+"  :: list");
//    	
//    	return sum;
//    }

}
//int m=Math.min(cost[i-1], cost[i-2]);
//System.out.println("cost ::"+cost[i]+"     minimum:: "+m+"    index :: "+i);



//public static int minCostClimbingStairs(int[] cost) {
//    
//	
//	for(int i=2;i<cost.length;i++)
//	{
//
//		cost[i]= cost[i]+Math.min(cost[i-1], cost[i-2]);
//		int m=Math.min(cost[i-1], cost[i-2]);
//		System.out.println("cost ::"+cost[i]+"     minimum:: "+m+"    index :: "+i);
//		
//	}
//	System.out.println(Arrays.toString(cost));
//	System.out.println(Math.min(cost[cost.length-1], cost[cost.length-2]) +" :: ans");
//	
//	
//	return Math.min(cost[cost.length-1], cost[cost.length-2]);
//}