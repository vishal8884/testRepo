package com.leetcodesolved;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MoveChipsToSamePosition {

	public static void main(String[] args) {

		int[] arr = {2,2,2,3,3};
		minCostToMoveChips(arr);
	}

	public static int minCostToMoveChips(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int g=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			else
			{
				g=map.get(arr[i]);
				g++;
				map.put(arr[i], g);
			}
		}
		
		
		System.out.println(map);
		return 0;
	}

}




//Set<Integer> keySet = map.keySet();
//Collection<Integer> values = map.values();
//
//System.out.println(values);