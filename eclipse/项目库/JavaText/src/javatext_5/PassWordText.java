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
		System.out.println("请输入您的密码:");
		this.password = in.next();
		char[] arr = this.password.toCharArray();
		int a=0;
		for(int i = 0 ;i<arr.length;i++){
			if(arr[i]>='0'&&arr[i]<='9'){
				a++;
			}
		}
		if(a<2){
			System.out.println("输入的密码至少要有两个数字");
			input();
		}
	}
	public void charge(){
		System.out.println("请输入你的密码");
		String S= in.next();
		if(S.equals(this.password)){
			System.out.println("密码正确");
		}
		else{
			System.out.println("密码错误请重新输入密码");
			charge();
		}
	}
}
