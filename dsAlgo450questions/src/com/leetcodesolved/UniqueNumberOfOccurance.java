package com.leetcodesolved;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;

public class UniqueNumberOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,2,1,1,3,2};
        uniqueOccurrences(arr);
	}

	public static boolean uniqueOccurrences(int[] arr) {

		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int x=0,c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
			    map.put(arr[i], 1);
			}
			else
			{
				x=map.get(arr[i]);
				x++;
				map.put(arr[i], x);
			}
			
		}
		System.out.println(map);
		Set<Integer> valuesSet = new HashSet<Integer>(map.values());
		System.out.println(map.size()==valuesSet.size());
		return map.size()==valuesSet.size();
	}

}




//for (Entry<Integer, Integer> entry : map.entrySet())  
//{
//    System.out.println(entry.getValue());
//}