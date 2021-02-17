package com.Arrays;

public class UnionOfTwoArraysCount {

	public static void main(String[] args) {

		int[] a = {1,5,8,6};
		int[] b = {1,4,2};
		
		unionOfTwoArrays(a,b);
//		addTwoArrays(a,b);
	}
	
	
	public static void unionOfTwoArrays(int[] a, int[] b)
	{
		if(a.length==1 && b.length==1)
		{
			System.out.println(a[0]);
		}
		int c=0,unionlen=0,note=0,noteindex=0;
		for(int i=0 ; i<a.length ;i++)
		{
			for(int j =0;j<b.length ;j++)
			{
				if(a[i]==b[j])
				{
					c++;
					note = a[i];
					noteindex=i;
				}	
				
					
					
			}
			System.out.println();
		}

		
			unionlen=a.length+b.length-c;
			System.out.println(unionlen+" union len");
			System.out.println("notea :: "+note );
			
			int arr[] = new int[unionlen];
			int bnew[] = removeElemFromArray(b,noteindex);
			arr = addTwoArrays(a,bnew);
			
			for(int i : arr)
			{
				System.out.println(i +" arr");
			}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	  public static int[] removeElemFromArray(int[] arr , int index)
	  {
		  int[] narr = new int[arr.length-1];
		  int j=0;
		  for(int i =0 ; i<arr.length;i++)
		  {
			  if(i!=index)
			  {
				  narr[j]=arr[i];
				  j++;
			  }
				  
		  }
		  return narr;
	  }
	  
	  public static int[] addTwoArrays(int[] array1 , int[] array2)
	  {
		    int aLen = array1.length;
	        int bLen = array2.length;
	        int[] result = new int[aLen + bLen];

	        System.arraycopy(array1, 0, result, 0, aLen);
	        System.arraycopy(array2, 0, result, aLen, bLen);
	        
	        return result;
	  }
	  
	

}
