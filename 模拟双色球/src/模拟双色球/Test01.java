package ģ��˫ɫ��;
/**
 * ģ��˫ɫ���ۺϰ���
 * 1���û�ѡ���ǻ�ѡ������ѡ����
 * 2�������û�ѡ�ã�6�� 1����
 * 3������ϵͳ���� ��6�� 1����
 * 4���Ƚ�ϵͳ������û����룬��¼
 * 5����֤�Ƿ��н�
 * 6��ϵͳ��������
 * 7���������
 * */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Test01 {

	public static void main(String[] args) {
		//������ر���
		int[] userRedBall = new int[6];	//�û�ѡ��ĺ���
		int[] sysRedBall = new int[6];	//ϵͳ���ɵĺ���
		int userBlueBall = 0;	//�û�ѡ�������
		int sysBlueBall = 0;	//ϵͳ���ɵ�����
		int redcount = 0;	//��¼�û�ѡ����ȷ�ĺ�����
		int bluecount =0;	//��¼�û�ѡ����ȷ��������
		int[] redBall = new int[33];	//���ڴ洢1-33�ĺ������
		//��Ҫ�������6�� 1-33֮�䲻�ظ��������㷨��
		for(int i =0; i <redBall.length; i++) {
			redBall[i] = i+1;
		}
		//��Ϸ��ʼ��ϵͳ��ʾ
		System.out.println("˫ɫ����Ϸ��ʼ��");
		System.out.println("��ѡ��ѡ��ģʽ��	��ps: 1����ѡ	2����ѡ��");
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		boolean flag = true;
		while(flag) {
			int isAuto = input.nextInt();
			switch(isAuto) {
			case 1:
				//��ѡ
				computerselection(redBall, userRedBall);	//��ѡ����
				userBlueBall = r.nextInt(16)+1;	//��ѡ����
				flag = false;
				break;
			case 2:
				//��ѡ
				System.out.println("��ѡ�������������(1 -33):");
				for(int i =0; i<userRedBall.length; i++) {
					userRedBall[i] =input.nextInt();
				}
				System.out.println("��ѡ��һ��������루1 -16��");
				userBlueBall = input.nextInt();
				flag = false;
				break;
			default:
				System.out.println("��ѡ��ѡ��ģʽ��	��ps: 1����ѡ	2����ѡ��");
				break;
			}
		}
		//ϵͳ������ɺ���
		//����
		computerselection(redBall, sysRedBall);
		//����
		sysBlueBall = r.nextInt(16)+1;
		
		//ͳ�ƽ����
		//ͳ�ƺ���
		for(int i =0; i<userRedBall.length; i++) {
			
			for(int j = 0; j<sysRedBall.length -redcount; j++) {
				
				if(userRedBall[i] == sysRedBall[j]) {
					int temp = sysRedBall[j];
					sysRedBall[j] = sysRedBall[sysRedBall.length -1 -redcount];
					sysRedBall[sysRedBall.length-1 - redcount] = temp;
					redcount++;
					break;
				}
			}
		}
		//ͳ������
		if(userBlueBall == sysBlueBall) {
			bluecount = 1;
		}
		
		//��֤�Ƿ��н�
		if(bluecount ==0 && redcount<=3) {
			System.out.println("���ң�������δ�ɹ���ͬ־����Ŭ����");
		}else if(bluecount == 1 && redcount<3) {
			System.out.println("��ϲ�� ���Ƚ���5Ԫ��");
		}else if((bluecount == 1 && redcount == 3)|| (bluecount == 0 && redcount ==4))  {
			System.out.println("��ϲ�� ��Ƚ���10Ԫ��");
		}else if((bluecount == 1 && redcount == 4)|| (bluecount == 0 && redcount ==5))  {
			System.out.println("��ϲ�� �ĵȽ���200Ԫ��");
		}else if(bluecount == 1 && redcount == 5)  {
			System.out.println("��ϲ�� ���Ƚ���3000Ԫ��");
		}else if(bluecount == 0 && redcount == 6) {
			System.out.println("��ϲ�� ���Ƚ���150wԪ��");
		}else if(bluecount == 1 && redcount == 6) {
			System.out.println("��ϲ�� һ�Ƚ���500wԪ��");
		}else {
			System.out.println("ϵͳ�����н���Ч��");
		}
		
		//����ϵͳ����
		System.out.println("�����н�������룺");
		sort(sysRedBall);
		System.out.println(Arrays.toString(sysRedBall));
		System.out.println("�����н���������룺" + sysBlueBall);
		
		//�����û�����
		System.out.println("��ѡ��ĺ������Ϊ��");
		sort(userRedBall);
		System.out.println(Arrays.toString(userRedBall));
		System.out.println("��ѡ�����ɫ����Ϊ��"  + userBlueBall);
		
	}
	//ð������
	public static void sort(int[] ball) {
		for(int i =0; i<ball.length -1; i++) {
			for(int j =0; j<ball.length -1 -i; j++) {
				if(ball[j]>ball[j+1]) {
					ball[j] = ball[j] + ball[j+1];
					ball[j+1] = ball[j] -ball[j+1];
					ball[j] = ball[j] -ball[j+1];
				}
			}
		}
	}
	
	//������ָ�������У�������ɶ�����ظ������㷨 
	public static void computerselection(int[] redBall, int[] userRedBall) {
		Random r = new Random();
		int index = -1;
		for(int i=0; i<userRedBall.length; i++) {
			index = r.nextInt(redBall.length -i); 
			userRedBall[i] = redBall[index];
			
			int temp = redBall[index];
			redBall[index] = redBall[redBall.length -1 -i];
			redBall[redBall.length-1-i] =temp;
		}
	}
}
