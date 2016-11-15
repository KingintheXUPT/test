package javatext_5;

import java.util.*;

public class AnagramText {
	public static boolean isAnagram(String s1,String s2){
		char[] arr = s1.toCharArray();
		char[] brr = s2.toCharArray();
		java.util.Arrays.sort(arr);
		java.util.Arrays.sort(brr);
		int a=0;
		if(arr.length>=brr.length){
			a=arr.length;
		}
		else a=brr.length;
		for(int i =0;i<a;i++){
			if(brr[i]!=arr[i]){
					System.out.println("他们不是变位词");
					return false;
			}
		}
		System.out.println("他们是变位词");
		return true;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String s1 = in.next();
		System.out.println("请输入第二个字符串");
		String s2 = in.next();
		isAnagram(s1, s2);
	}

}
