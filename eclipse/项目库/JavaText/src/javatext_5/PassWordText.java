package javatext_5;

import java.util.*;

public class PassWordText {
	public static void main(String[] args){
		PassWord pw = new PassWord();
		pw.input();
		pw.charge();
	}

}
class PassWord{
	Scanner in = new Scanner(System.in);
	private String password="WNV1416369417";
	public void PassWord(){		
	}
	public void input(){
		System.out.println("��������������:");
		this.password = in.next();
		char[] arr = this.password.toCharArray();
		int a=0;
		for(int i = 0 ;i<arr.length;i++){
			if(arr[i]>='0'&&arr[i]<='9'){
				a++;
			}
		}
		if(a<2){
			System.out.println("�������������Ҫ����������");
			input();
		}
	}
	public void charge(){
		System.out.println("�������������");
		String S= in.next();
		if(S.equals(this.password)){
			System.out.println("������ȷ");
		}
		else{
			System.out.println("���������������������");
			charge();
		}
	}
}
