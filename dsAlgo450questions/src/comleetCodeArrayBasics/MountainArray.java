package comleetCodeArrayBasics;

public class MountainArray {

	public static void main(String[] args) {

		int[] arr = {0,1,2,4,2,1};
		boolean op=validMountainArray(arr);
		System.out.println("op ::"+op);
	}
	
     public static boolean validMountainArray(int[] A) {
       
    	 int N = A.length;
         int i = 0;

         // walk up
         while (i+1 < N && A[i] < A[i+1])
             i++;

         // peak can't be first or last
         if (i == 0 || i == N-1)
             return false;

         // walk down
         while (i+1 < N && A[i] > A[i+1])
             i++;

         return i == N-1;
    }

}
