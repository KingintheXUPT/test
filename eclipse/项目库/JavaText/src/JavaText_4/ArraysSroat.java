package JavaText_4;

public class ArraysSroat {
	public static long linearSearch(long[] list,long key){
		for(int i=0;i<list.length;i++){
			if(list[i]==key) return i;
		}
		return -1;
	}
	public static void main(String[] args){
		long[] Array = new long[100000];
		long x = 1+(long)(Math.random()*100000);
		for(int i=0;i<Array.length;i++){
			Array[i] = 1+(long)(Math.random()*100000);
		}
		long key =1+(long)(Math.random()*100000);
		java.util.Arrays.sort(Array);
		long startTime1 = System.nanoTime();
		java.util.Arrays.binarySearch(Array,key);
		long endTime1 = System.nanoTime();
		long executionTime1 = endTime1 - startTime1;
		System.out.println("bilnarySearch方法的时间为:"+executionTime1);
		long startTime2 = System.nanoTime();
		linearSearch(Array,key);
		long endTime2 = System.nanoTime();
		long executionTime2 = endTime2 - startTime2;
		System.out.println("linearSearch方法的时间为:"+executionTime2);
	}
}	