package javatext_6;

import java.util.*;

public class Javatext9_28{
	public static String[] prefix(String s1,String s2){
		int a= (s1.length()>s2.length())?s2.length():s1.length();
		char[] arr = s1.toCharArray();
		char[] brr = s2.toCharArray();
		for(int i = 0;i<a;i++){
			if(arr[i]==brr[i]){
				System.out.print(arr[i]);
			}
		}
		return null;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		prefix(args[0],args[1]);
	}
}
