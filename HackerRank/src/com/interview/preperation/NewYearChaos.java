package com.interview.preperation;

public class NewYearChaos {
	static void minimumBribes(int[] q) {
		int count=0;
		boolean check=false;
		for(int i=0;i<q.length;i++)
		{
			int diff=q[i]-(i+1);
			if(diff>0 && diff<3)
			{
				count+=diff;
			}
			if(diff>2)
			{
				check=true;
				break;
			}
		}
		if(check)
			System.out.println("Too chaotic");
		else
			System.out.println(count);
	}
	public static void main(String[] args) {
		int arr[]= {2,1,5,3,4};
		minimumBribes(arr);
	}

}
