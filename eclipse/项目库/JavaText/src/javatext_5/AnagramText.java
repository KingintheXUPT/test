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
					System.out.println("���ǲ��Ǳ�λ��");
					return false;
			}
		}
		System.out.println("�����Ǳ�λ��");
		return true;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		String s1 = in.next();
		System.out.println("������ڶ����ַ���");
		String s2 = in.next();
		isAnagram(s1, s2);
	}

}
