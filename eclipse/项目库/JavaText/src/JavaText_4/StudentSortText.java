package JavaText_4;

import java.util.Scanner;

public class StudentSortText {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫѧ���ĸ���:");		
		int x = input.nextInt();
		Student[] stulist = new Student[x];
		for(int i = 0 ;i<stulist.length;i++){
			stulist[i]= new Student();
			System.out.println("�������"+(i+1)+"��ѧ���������ͳɼ�");
			System.out.println("��"+(i+1)+"λͬѧ������:");
			String name = input.next();
			stulist[i].inputName(name);
			System.out.println("��"+(i+1)+"λͬѧ�ĳɼ�:");
			int score = input.nextInt();
			stulist[i].inputScore(score);			
		}
		for(int i=stulist.length-1;i>=0;i--){
			Student k = stulist[i];
			for(int j=i-1;j>=0;j--)
				if(stulist[j].outScore()<stulist[i].outScore()){
					k=stulist[j];
					stulist[j]=stulist[i];
					stulist[i]=k;
					k=stulist[i];
			}
		}		
		for(int i=0;i<stulist.length;i++){
			System.out.println("��"+(i+1)+"��ͬѧ��"+stulist[i].outName());
		}
	}

}
class Student{
	private String name;
	private int score;
	public Student(){
	}
	public void inputName(String name){
		  this.name=name;
	}
	public void inputScore(int score){
		this.score=score;
	}
	public String outName(){
		return this.name;
	}
	public int outScore(){
		return this.score;
	}
}