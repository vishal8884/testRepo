package com.leetcodesolved;

public class CountNegetiveInSortedMatix {

	public static void main(String[] args) {

		int[][] arr= {{4,3,2,-1},
				     {3,2,1,-1},
				     {1,1,-1,-2},
				     {-1,-1,-2,-3}};
		countNegatives(arr);
	}

	public static int countNegatives(int[][] grid) {
		
		int c=0;
		
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[i].length;j++)
			{
				if(grid[i][j]<0)
				{
					c++;
				}
			}
		}
         System.out.println(c);
		return 0;
	}

}
