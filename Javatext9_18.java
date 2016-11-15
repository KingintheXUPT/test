package javatext_6;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.*;

public class Javatext9_18 {
	Scanner in = new Scanner(System.in);
	public static int Sum(int[] a){
		int sum=0;
		int aver;
		for(int i = 0;i<a.length;i++){
			sum=sum+a[i];
		}
		return sum;
	}
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
	}
	public static void main(String[] args){
		int[] arr = new int[args.length];
		for(int i = 1;i<args.length;i++){
			if(isNumeric(args[i])){
				arr[i] = Integer.parseInt(args[i]);
			}
		}
		System.out.println("总成绩为"+Sum(arr)+"平均成绩为"+Sum(arr)/args.length);
	}
}
