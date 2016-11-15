package javatext_5;

import java.util.Random;

public class RandomText {
	public static v+++oid main(String[] args){
		Random ran = new Random(1000);
		System.out.println(ran);
		for(int i = 0;i<50;i++){
			System.out.println(ran.nextInt(100));
		}
	}

}
