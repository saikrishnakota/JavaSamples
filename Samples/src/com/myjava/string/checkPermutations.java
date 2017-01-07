package com.myjava.string;
//Given two Strings, write a method to decide if one is permutation of the another.
//citations of Cracking the Code Interview book(This is file is just the practise of the solution mentioned in the book)
public class checkPermutations {
	public static void main(String[] args)
	{
		String s = "dog";
		String d = "god";
		System.out.println("output is:" +permutations(s, d));
	}
	public static String sort(String s){
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public static boolean permutations(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
