package com.interview.preperation;

public class JumpingCloud {
	 static int jumpingOnClouds(int[] c) {
	        int count=0,i=0,check=0;
	       while(i<c.length-1)
	        {
	    	   if(i+2>c.length-1)
	    		   check=1;
	            if( check==0&&c[i+2]!=1)
	            i+=2;
	            else if(c[i+1]!=1)
	            {
	            i++;
	            check=0;
	            }
	            else
	            {
	                i-=2;
	                check=1;
	            }
	            count++;
	        }
	    return count;
	    }
	 public static void main(String[] args)
	 {
		 int arr[]={0,0,1,0,0,0,0,1,0,0};
	//	 int arr[]={0,0,0,1,0,0};
		 System.out.println(jumpingOnClouds(arr));
	 }
}
