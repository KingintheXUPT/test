package javatext_6;

import java.math.BigInteger;

public class javatext_6_14_11 {
	public static void main(String[] args){
		int sum=0;
		BigInteger a = new BigInteger(Long.MAX_VALUE+"");
		while(sum<10){
			a = a.add(BigInteger.ONE);	
			if((a.remainder(new BigInteger("5"))).equals(BigInteger.ZERO)||(a.remainder(new BigInteger("6"))).equals(BigInteger.ZERO)){
				sum++;
				System.out.println(a);
			}
		}		
	}
}
