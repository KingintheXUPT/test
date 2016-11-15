package javatext_7; 

import java.util.Date;

import java.lang.*;

public class javatext14_2 {
	public static void main(String[] args){
		ComparableCircle x =new ComparableCircle(10);
		ComparableCircle y =new ComparableCircle(15);
		System.out.println(x.compareTo(y));
	}
}

class ComparableCircle extends Circle implements Comparable{
	public ComparableCircle(double x){
		super(x);
	}
	public int compareTo(Object o) {
		if(getArea()>((ComparableCircle)o).getArea()){
			return 1;
		}
		else if(getArea()<((ComparableCircle) o).getArea()){
			return -1;
		}
		else
			return 0;
	}
	
}

class Circle extends GeometricObject{
	protected double radius=1.0;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
}
abstract class  GeometricObject {
    private String color = "white";
    private boolean filled;
    Date dateCreated;
    
    public GeometricObject() {
        dateCreated = new Date();
    }
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        Date dateCreated = new Date();
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getArea(){
    	return 0;
    }
    public String toString() {
        return "Created on " + dateCreated + "\ncolor " + color +
                " and filled" + filled;
    }   
}


