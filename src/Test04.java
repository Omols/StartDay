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
		System.out.println("����һ�����ֲ²��������");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		
		
		boolean flag = false;
		for(int x:nums) {
			if(userNum == x) {
				flag =true;
			}
		}
		if(flag) {
			System.out.println("��ϲ�㣬��ȷ��");
		}else {
			System.out.println("����Ŷ��");
		}
	}
	
	
}
