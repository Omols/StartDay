import java.util.Scanner;
import java.util.Random;
public class Test04 {
	public static void main(String[] args) {
		int[] nums =new int[]{};
		int len = nums.length;
		Random r = new Random();
		for(int i =0; i<len; i++) {
			nums[i] = r.nextInt(50);
		}
		System.out.println("输入一个数字猜猜随机数！");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		
		
		boolean flag = false;
		for(int x:nums) {
			if(userNum == x) {
				flag =true;
			}
		}
		if(flag) {
			System.out.println("恭喜你，正确！");
		}else {
			System.out.println("不对哦！");
		}
	}
	
	
}
