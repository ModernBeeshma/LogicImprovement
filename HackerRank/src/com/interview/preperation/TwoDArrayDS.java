package com.interview.preperation;

public class TwoDArrayDS {
	 static int hourglassSum(int[][] arr) {
		 int row=arr.length-2;
		 int col=arr[0].length-2;
		 int sum=0;
		 int result=-99999999;
		 for(int outerRow=0;outerRow<row;outerRow++)
		 {
			 for(int outerCol=0;outerCol<col;outerCol++)
			 {
				 sum=0;
			 for(int innerRow=outerRow,filterx=1;innerRow<outerRow+3;innerRow++,filterx++)
			 {
				 for(int innerColumn=outerCol,filtery=1;innerColumn<outerCol+3;innerColumn++,filtery++)
				 {
					 if(filterx%2==0&&filtery%2!=0)
					 {
						 
					 }
					 else
					 {
						 sum+=arr[innerRow][innerColumn];
					 }
				 }
				
			 }
			 if(result<sum)
			 {
				 result=sum;
			 }
			 }
		 }
		return result;
	    }
	public static void main(String[] args) {
	//int arr[][]= {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
		int arr[][]= {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};
		
		System.out.println(hourglassSum(arr));
	}

}
