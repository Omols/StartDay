//求最大最小值

public class BigSmall {
	public static void main(String[] args) {
		int[] num = {10,5,70,55,66,20};
		int max = max(num);
		System.out.println("数列中最大的" + max);
		int min = min(num);
		System.out.println("数列中最大的" + min);
	}
	
	public static int max(int[] num){
		int max  = num[0];
		int len = num.length;
		for(int i =1; i<len; i++) {
			if(num[i]>max) {
				num[i] = num[i] + max;
				max = num[i]-max;
				num[i] = num[i] -max;
			}
		}
		return max;
	}
	
	public static int min(int[] num){
		int min  = num[0];
		int len = num.length;
		for(int i =1; i<len; i++) {
			if(num[i]<min) {
				num[i] = num[i] + min;
				min = num[i]-min;
				num[i] = num[i] -min;
			}
		}
		return min;
	}
}
