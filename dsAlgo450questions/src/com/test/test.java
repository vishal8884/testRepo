package com.test;

public class test {

	public static void main(String[] args) {

		
		System.out.println(nearToFiveMulti(38));
		
	}

	private static int nearToFiveMulti(int n) {
		
		if(n%5==0)
			System.out.println("its divisible by 5");
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
	

}
