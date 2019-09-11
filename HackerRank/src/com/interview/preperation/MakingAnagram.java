package com.interview.preperation;

public class MakingAnagram {
	  static int makeAnagram(String a, String b) {
		  int count=0;
		 int blength=b.length();
		  StringBuilder stringBuilder=new StringBuilder(b);
		  for(int aIterator=0;aIterator<a.length();aIterator++)
		  {
			 for(int bIterator=0;bIterator<stringBuilder.length();bIterator++)
			 {
				 if(a.charAt(aIterator)==stringBuilder.charAt(bIterator))
				 {
					 count++;
					 stringBuilder= stringBuilder.replace(bIterator, bIterator+1,"*");
					 a=a.replaceFirst(""+a.charAt(aIterator),"#");
				 }
//				 if(stringBuilder.charAt(bIterator)=='*')
//					 blength++;
			 }
		  }
		  int aRemain=a.length()-count;
		  int bRemain= blength-count;
		return aRemain+bRemain;
	        
	    }
public static void main(String[] args)
{
	int result=makeAnagram("abcd","abdc");
	System.out.println(result);
}
}
