import java.util.Scanner;
import java.util.Random;	//����α�����
public class Test03 {
	public static void main(String[] args) {
		//int[] nums = {10,20,30,40};	//�ȶ���һ������
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();	//����һ����������������Ĺ���
		for(int i =0; i<len; i++) {
			nums[i] =r.nextInt(50);
		}
		System.out.println("����һ���������²���������ʲô���ְɣ� ps:��Ȼ����ʮ��");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();	//����һ�������������û�������
		boolean flag = false;
		for(int x:nums) {
			if(userNum == x) {
				flag = true;
			}
			
		}
		
		if(flag) {
			System.out.println("��ϲ�㣡 �ҵ���");
		}else {
			System.out.println("���ź�����û���ҵ�");
		}
	}
}
