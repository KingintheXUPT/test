package JavaText_4;

import java.util.Calendar;

public class MyDateText {
	public static void main(String[] args){
		MyDate date = new MyDate();
		date.setDate(561555550000l);		
		System.out.println(date.year+"��"+date.month+"��"+date.day+"��");
		MyDate date1 = new MyDate(561555550000l); 
		System.out.println(date1.year+"��"+date1.month+"��"+date1.day+"��");		
	}

}


class MyDate{
	int year;
	int month;
	int day;
	public MyDate(){
	}
	public MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
    public MyDate(Long millisecond){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millisecond);
        this.year=calendar.get(Calendar.YEAR);
        this.month=calendar.get(Calendar.MONTH)+1;
        this.day=calendar.get(Calendar.DAY_OF_MONTH)-1;
    }
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getday(){
		return this.day;
	}
    public void setDate(long elapsedTime){
        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year=calendar.get(Calendar.YEAR);
        this.month=calendar.get(Calendar.MONTH)+1;
        this.day=calendar.get(Calendar.DAY_OF_MONTH)-1;
    }
}