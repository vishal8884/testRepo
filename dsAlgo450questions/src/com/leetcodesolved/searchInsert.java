package com.leetcodesolved;

public class searchInsert {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,6};
		searchInsert2(arr,0);

	}
	
     public static void searchInsert2(int[] arr, int target) {
    	 int n=0;
    	 boolean x=false;
    	 if(target<arr[0])
    	 {
    		 System.out.println(0+" outpur");
    	 }
    	 
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]==target)
    		 {	 
                  n=i;
                  x=true;
    		 }
    		 else if(target>arr[i])
    			  n=i;
    	 }
    	 if(!x)
    	 System.out.println(n+1+" ::output");
    	 else
         System.out.println(n+" output ");		 
        
    }
     
//     public static int searchInsert(int[] arr, int target) {
//    	 
//    	 int n=0;
//    	 boolean x=false;
//    	 
//    	 for(int i=0;i<arr.length;i++)
//    	 {   
//    		 if(arr[i]==target)
//    		 {	 
//                  n=i;
//                  x=true;
//    		 }
//    		 
//    		 else if(target>arr[i])
//    			  n=i;
//    	 }
//    	 if(!x)
//    	 return n+1;
//    	 else
//         return n;
//     }

}
