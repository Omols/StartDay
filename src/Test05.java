//打印一个正三角形

public class Test05 {
	public static void main(String[] args) {
		char[] nums = {'a','b','c','d','e','f','g'};
		int len = nums.length;
		for(int i =1; i<=len; i++) {
			for(int j = i; j<len; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1; j++) {
				System.out.print(nums[i-1]);
			}
			System.out.println();
		}
		
	}
}
