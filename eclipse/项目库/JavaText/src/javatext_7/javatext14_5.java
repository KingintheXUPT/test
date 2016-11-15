package javatext_7;

import java.util.*;
import java.util.Date;

public class javatext14_5 {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个圆形的半径");
		Circle1 circle1 = new Circle1(in.nextDouble());
		System.out.println("请输入第二个圆形的半径");
		Circle1 circle2 = new Circle1(in.nextDouble());
		System.out.println(circle1.equals(circle2));
	}
}


class Circle1 extends  GeometricObject implements Comparable<Object>{
	protected double radius =0;
	public Circle1(){
	}
	public Circle1(double radius){
		this.radius=radius;
	}
	public boolean equals(Object o){
		if(radius == ((Circle1) o).radius ){
			return true;
		}
		return false;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(getArea()>( (Circle1) o).getArea()){
			return 1;
		}
		return 0;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}