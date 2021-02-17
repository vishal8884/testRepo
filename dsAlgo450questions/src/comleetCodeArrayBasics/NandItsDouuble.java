package comleetCodeArrayBasics;

import java.util.HashSet;
import java.util.Set;

public class NandItsDouuble {

	public static void main(String[] args) {

		int[] arr = {10,2,5,3};
		checkIfExist(arr);
	}
	
     public static boolean checkIfExist(int[] arr) {
        int a=0,b=0;
		boolean check=false;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=0;j<arr.length;j++)
    		 {
    			 a=arr[i];
    			 b=arr[j];
    			 if(i!=j&&a==b*2)
    			 {
    				 
    				 System.out.println("a:: "+a+"   b :: "+b);
    				 check=true;
    			 }
    		 }
    	 }
    	 

    	 
    	 return check;
    }
     
     
     public boolean checkIfExist2(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	    for (Integer num : arr) {
	      if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
	        return true;
	      }
	      set.add(num);
	    }
	    return false;
	    }

}
