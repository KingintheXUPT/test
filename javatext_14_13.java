package javatext_6;

import java.math.BigDecimal;
import java.math.BigInteger;

public class javatext_14_13 {
	public static void main(String[] args){
		BigInteger a = new BigInteger(Long.MAX_VALUE+"");
		int i = 0;
		double c=a.doubleValue();
		BigDecimal b = new BigDecimal(Math.sqrt(c));
		
		double d = Math.pow(b, 2);
		while(i<10){
			b+=1;
			System.out.println(new BigInteger((long)d+""));
			i++;
		}
	}

}
