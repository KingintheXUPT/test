package JavaText_4;

public class javaText2 {
	public static void main(String[] args){
		double[] list={2.0,3.0,4.0,5.0,6.0,1.0,7.0,4.0,9.0,10.0};
		for(int i=9;i>=0;i--){
			double k = list[i];
			for(int j=i-1;j>=0;j--)
				if(list[j]>list[i]){
					k=list[j];
					list[j]=list[i];
					list[i]=k;
					k=list[i];
			}
		}
		for(double value:list){
			System.out.println(value);
		}
	}

}
