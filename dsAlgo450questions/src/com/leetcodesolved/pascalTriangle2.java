package com.leetcodesolved;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {

	public static void main(String[] args) {

		System.out.println(getRow(3));
	}
	
	
	public static List<Integer> getRow(int m) {
	    int n=m+1;
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		 
	    List<Integer> first_row = new ArrayList<Integer>();
	    first_row.add(1);
	    if(n==0)
	    {
	    	return first_row;
	    }
	    triangle.add(first_row);
		
	    
	    for(int i=1;i<n;i++)
	    {
	    	List<Integer> previousRow = triangle.get(i-1);
	    	List<Integer> row = new ArrayList<Integer>();
	    	
	    	row.add(1);
	    	for(int j=1;j<i;j++)
	    	{
	    		row.add(previousRow.get(j-1)+previousRow.get(j));
	    	}
	    	
	    	row.add(1);
	    	System.out.println("row :"+row);
	    	triangle.add(row);
	    	
	    	
	    	
	    }
	    System.out.println(triangle);
	    
	    
		
		return triangle.get(triangle.size()-1);
    }

}
