package javatext_6;

import java.math.BigInteger;

public class javatext14_14 {
	public static void main(String[] args){
		BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE));
		int sum=0;
		while(sum<5){
			a = a.add(BigInteger.ONE);		
			if(a.isProbablePrime(100000)){
				sum++;
				System.out.println(a.toString());
			}
		}
	}
}
