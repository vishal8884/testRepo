package com.hackerRankAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTheTreeplets {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);

		gradingStudents(list);

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> op = new ArrayList<Integer>();
		for(int i=0;i<grades.size();i++)
		{
			if(!(grades.get(i)<38))
			{
//				System.out.println(grades.get(i));
				System.out.println(nearToFiveMulti(grades.get(i))+" and  gradess ::"+grades.get(i));
				int near=nearToFiveMulti(grades.get(i));
				grades.set(i, near);
			}
		}
		
		System.out.println(grades);
		return grades;
	}

	
	
	
	
     static int nearToFiveMulti(int n) {
		
    	 if(n%5==0)
    		 return n;
 		int near = n%5,sub=0;
 		switch(near)
 		{
 		case 1: sub=4;
 		break;
 		case 2: sub=3;
 		break;
 		case 3: sub=2;
 		break;
 		case 4: sub=1;
 		break;
 		}
 		
 		if(sub<3)
 		return n+sub;
 		else
 		return n;	
	}
	
	
	static String timeConversion(String s) {

		int sLen = s.length();
		String Am_Pm = s.substring(sLen - 2, sLen), op;
		if (Am_Pm.equals("AM")) {
			String hour = s.substring(0, 2);
			if (hour.equals("12"))
				op = "00" + s.substring(2, sLen - 2);
			else
				op = s.substring(0, sLen - 2);
		} else {
			int hour = Integer.valueOf(s.substring(0, 2));
			String pm_hour = String.valueOf(hour + 12);
			if (!(s.substring(0, 2).equals("12")))
				op = pm_hour + s.substring(2, sLen - 2);
			else
				op = s.substring(0, sLen - 2);

		}
		System.out.println(op + " final op");
		return op;

	}

	public static int birthdayCakeCandles(List<Integer> candles) {

		Collections.sort(candles);
		int count = 0;
		int max = candles.get(candles.size() - 1);

		for (int i : candles) {
			if (i == max)
				count++;
		}

		System.out.println(count);
		return 0;
	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> l1 = new ArrayList<Integer>();
		int c1 = 0, c2 = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (i == j && a.get(i) > b.get(j))
					c1++;

				if (i == j && a.get(i) < b.get(j))
					c2++;
			}
		}

		l1.add(c1);
		l1.add(c2);
		return l1;
	}

}
