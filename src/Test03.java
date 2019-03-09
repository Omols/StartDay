import java.util.Scanner;
import java.util.Random;	//生成伪随机数
public class Test03 {
	public static void main(String[] args) {
		//int[] nums = {10,20,30,40};	//先定义一个数组
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();	//创建一个可以生成随机数的工具
		for(int i =0; i<len; i++) {
			nums[i] =r.nextInt(50);
		}
		System.out.println("输入一个数字来猜猜数组里有什么数字吧！ ps:自然数整十数");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();	//定义一个变量来接收用户的输入
		boolean flag = false;
		for(int x:nums) {
			if(userNum == x) {
				flag = true;
			}
			
		}
		
		if(flag) {
			System.out.println("恭喜你！ 找到了");
		}else {
			System.out.println("很遗憾，你没有找到");
		}
	}
}
