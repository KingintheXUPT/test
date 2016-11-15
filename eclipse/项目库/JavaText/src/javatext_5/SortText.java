package javatext_5;

import java.util.Scanner;
import java.util.Arrays;

public class SortText {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}	
}