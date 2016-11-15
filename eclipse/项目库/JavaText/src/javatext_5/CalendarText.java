package javatext_5;

import java.util.*;

public class CalendarText {
	public static void main(String[] args){
		GregorianCalendar date = (GregorianCalendar) GregorianCalendar.getInstance();
		System.out.println(date.get(GregorianCalendar.YEAR)+"年"+(date.get(GregorianCalendar.MONTH)+1)+"月"+date.get(GregorianCalendar.DATE)+"日");
		date.setTimeInMillis(1234567898765l);
		System.out.println(date.get(GregorianCalendar.YEAR)+"年"+(date.get(GregorianCalendar.MONTH)+1)+"月"+date.get(GregorianCalendar.DATE)+"日");
	}
}
