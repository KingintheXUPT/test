package JavaText_4;

import java.util.*;

public class booleanequal {
	public static boolean Equal(int[] list1,int[] list2){
		if(java.util.Arrays.equals(list1,list2)){
			return true;
		}
		return false;		
	}
	public static void main(String[] args){
		int[] list1 = new int[6];
		int[] list2 = new int[6];
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个数组的所有元素");
		for(int i = 0;i<6;i++){
			list1[i]= in.nextInt();
		}
		System.out.println("请输入第二个数组的所有元素");
		for(int i =0;i<6;i++){
			list2[i] = in.nextInt();
		}
		System.out.println(Equal(list1,list2));
	}

}


