package com.interview.preperation;

public class NewYearChaos {
	static void minimumBribes(int[] q) {
//		int count=0;
//		boolean check=false;
//		for(int i=0;i<q.length;i++)
//		{
//			int diff=q[i]-(i+1);
//			if(diff>0 && diff<3)
//			{
//				count+=diff;
//			}
//			if(diff>2)
//			{
//				check=true;
//				break;
//			}
//		}
//		if(check)
//			System.out.println("Too chaotic");
//		else
//			System.out.println(count);
		int ans = 0;
	    for (int i = q.length - 1; i >= 0; i--) {
	        if (q[i] - (i + 1) > 2) {
	        	System.out.println("Too chaotic");
	            return;
	        }
	        for (int j = Math.max(0, q[i] - 2); j < i; j++)
	            if (q[j] > q[i]) ans++;
	    }
	    System.out.println(ans);
	}
	public static void main(String[] args) {
		int arr[]={1,2,5,3,7,8,6,4};
		//int arr[]= {2,1,5,3,4};
		minimumBribes(arr);
	}

}
