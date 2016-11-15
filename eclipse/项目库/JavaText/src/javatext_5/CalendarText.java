package javatext_5;

import java.util.*;

public class CalendarText {
	public static void main(String[] args){
		GregorianCalendar date = (GregorianCalendar) GregorianCalendar.getInstance();
		System.out.println(date.get(GregorianCalendar.YEAR)+"��"+(date.get(GregorianCalendar.MONTH)+1)+"��"+date.get(GregorianCalendar.DATE)+"��");
		date.setTimeInMillis(1234567898765l);
		System.out.println(date.get(GregorianCalendar.YEAR)+"��"+(date.get(GregorianCalendar.MONTH)+1)+"��"+date.get(GregorianCalendar.DATE)+"��");
	}
}
