package javatext_6;

import java.math.BigDecimal;

import org.omg.CosNaming.BindingIteratorHelper;

public class javatext14_16 {
	public static BigDecimal Expt(int a){
		BigDecimal x = new BigDecimal(1);
		if(a==0) return BigDecimal.ONE;
		for(int i = 1;i<=a;i++){
			x=x.multiply(new BigDecimal(i));
		}
		return x;
	}
	public static void main(String[] args){
		BigDecimal sum =new BigDecimal(0);
		BigDecimal a = new BigDecimal(1);
		for(int i = 100;i<=1000;i+=100){
			sum=BigDecimal.ZERO;
			for(int j = i;j>=0;j--){
				sum=sum.divide(BigDecimal.ONE.divide((Expt(j))));
			}
			System.out.println(sum);
		}
	}

}
