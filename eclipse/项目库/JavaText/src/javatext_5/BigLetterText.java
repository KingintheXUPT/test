package javatext_5;

import java.util.*;

public class BigLetterText {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int a=0;
		char[] arr = s.toCharArray();
		for(int i = 0; i<arr.length;i++){
			if(arr[i]>=65&&arr[i]<=90){
				a++;
			}
		}
		System.out.println(a);
	}

}
