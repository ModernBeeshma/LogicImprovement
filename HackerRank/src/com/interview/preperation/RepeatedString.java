package com.interview.preperation;

public class RepeatedString {
public static void main(String args[])
{
	String s="aba";
	long n=10;
	System.out.println(repeatedString(s, n));
}
static long repeatedString(String s, long n) {
	long l=s.length();
	long div=n/l;
	long mod=n%l;
	String res="";
	// for(int i=0;i<div;i++)
	// {
	// res+=s;
	// }
	long count=0;
	for(int i=0;i<s.length();i++)
	{
	   if(s.charAt(i)=='a')
	   count++;
	}
	count=div*count;
	res=s.substring(0,(int)mod);
	for(int i=0;i<res.length();i++)
	{
	   if(s.charAt(i)=='a')
	   count++;
	}
	System.out.print(s.substring(0,(int)mod));

	// for(int i=0;i<res.length();i++)
	// {
//	    if(res.charAt(i)=='a')
//	    count++;
	// }
	return count;
}
}
