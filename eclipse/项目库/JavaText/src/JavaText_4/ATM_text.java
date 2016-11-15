package JavaText_4;

import java.util.*;

public class ATM_text {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Account[] account = new Account[10];
		for(int i = 0;i<account.length;i++){
			account[i] = new Account();
			account[i].inputId(i);
		}
		int m=1;
		while(m==1){
			System.out.println("请输入你的id");
			int id = in.nextInt();
			if(id<=9&&id>=0){
				account[id].choice();
			}
		}
	}

}

class Account{
	Scanner in = new Scanner(System.in);
	private int id = 0;
	private int money = 100;
	public Account(){
	}
	public void inputId(int id){
		this.id=id;
	}
	public void inputMoney(int money){
		this.money=money;
	}
	public int takeId(){
		return this.id;
	}
	public void takeMoney(){
		System.out.println(this.money);
	}
	public void getMoney(int money){
		this.money-=money;
	}
	public void giveMoney(int money){
		this.money+=money;
	}
	public boolean search(int id){
		if(id==this.id){
			return true;
		}
		return false;
	}
	public int choice(){
		System.out.println("请输入你的选择（1到4之间）:");
		int x = in.nextInt();
		if(x==1){
			takeMoney();
		}
		if(x==2){
			System.out.println("请输入你想要取得钱数:");
			int money = in.nextInt();
			this.getMoney(money);
		}
		if(x==3){
			System.out.println("请输入你想要存入的金钱数");
			int money = in.nextInt();	
			this.giveMoney(money);
		}
		if(x==4){
			return 1;
		}
		return -1;
	}
}
