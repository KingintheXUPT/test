package javatext_7;

import java.util.*;

import java.util.Scanner;

public class javatext14_9 {
	public static Object max(Comparable[] crr){
		Object m = crr[0];
		for(Comparable u:crr){
			if(((Comparable) m).compareTo(u)<0 ){
				m=u;
			}
		}
		return m;
	}
	public static void main(String[] args){
		Integer[] crr = {1,2,3,2};
		System.out.println("�������"+max(crr));
		String[] arr = {"sda","dasdas","dasda"};
		System.out.println("�ַ�c'c�����"+max(arr));		 
		System.out.println("�������"+max(new Date[]{new Date(2066,2,14),new Date(2013,3,56),new Date(2003,5,6)} ));
	}
}