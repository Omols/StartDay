package 模拟双色球;
/**
 * 模拟双色球综合案例
 * 1、用户选择是机选还是手选号码
 * 2、接收用户选好（6红 1蓝）
 * 3、生成系统号码 （6红 1蓝）
 * 4、比较系统号码和用户号码，记录
 * 5、验证是否中奖
 * 6、系统号码排序
 * 7、公布结果
 * */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Test01 {

	public static void main(String[] args) {
		//定义相关变量
		int[] userRedBall = new int[6];	//用户选择的红球
		int[] sysRedBall = new int[6];	//系统生成的红球
		int userBlueBall = 0;	//用户选择的蓝球
		int sysBlueBall = 0;	//系统生成的蓝球
		int redcount = 0;	//记录用户选择正确的红球数
		int bluecount =0;	//记录用户选择正确的蓝球数
		int[] redBall = new int[33];	//用于存储1-33的红球号码
		//需要随机生成6个 1-33之间不重复的数（算法）
		for(int i =0; i <redBall.length; i++) {
			redBall[i] = i+1;
		}
		//游戏开始，系统提示
		System.out.println("双色球游戏开始了");
		System.out.println("请选择选号模式：	（ps: 1、机选	2、手选）");
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		boolean flag = true;
		while(flag) {
			int isAuto = input.nextInt();
			switch(isAuto) {
			case 1:
				//机选
				computerselection(redBall, userRedBall);	//机选红球
				userBlueBall = r.nextInt(16)+1;	//机选蓝球
				flag = false;
				break;
			case 2:
				//手选
				System.out.println("请选择六个红球号码(1 -33):");
				for(int i =0; i<userRedBall.length; i++) {
					userRedBall[i] =input.nextInt();
				}
				System.out.println("请选择一个蓝球号码（1 -16）");
				userBlueBall = input.nextInt();
				flag = false;
				break;
			default:
				System.out.println("请选择选号模式：	（ps: 1、机选	2、手选）");
				break;
			}
		}
		//系统随机生成号码
		//红球
		computerselection(redBall, sysRedBall);
		//蓝球
		sysBlueBall = r.nextInt(16)+1;
		
		//统计结果：
		//统计红球
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
		//统计蓝球
		if(userBlueBall == sysBlueBall) {
			bluecount = 1;
		}
		
		//验证是否中奖
		if(bluecount ==0 && redcount<=3) {
			System.out.println("不幸，革命尚未成功，同志仍需努力！");
		}else if(bluecount == 1 && redcount<3) {
			System.out.println("恭喜！ 六等奖，5元！");
		}else if((bluecount == 1 && redcount == 3)|| (bluecount == 0 && redcount ==4))  {
			System.out.println("恭喜！ 五等奖，10元！");
		}else if((bluecount == 1 && redcount == 4)|| (bluecount == 0 && redcount ==5))  {
			System.out.println("恭喜！ 四等奖，200元！");
		}else if(bluecount == 1 && redcount == 5)  {
			System.out.println("恭喜！ 三等奖，3000元！");
		}else if(bluecount == 0 && redcount == 6) {
			System.out.println("恭喜！ 二等奖，150w元！");
		}else if(bluecount == 1 && redcount == 6) {
			System.out.println("恭喜！ 一等奖，500w元！");
		}else {
			System.out.println("系统有误，中奖无效！");
		}
		
		//公布系统号码
		System.out.println("本期中奖红球号码：");
		sort(sysRedBall);
		System.out.println(Arrays.toString(sysRedBall));
		System.out.println("本期中奖的蓝球号码：" + sysBlueBall);
		
		//公布用户号码
		System.out.println("您选择的红球号码为：");
		sort(userRedBall);
		System.out.println(Arrays.toString(userRedBall));
		System.out.println("您选择的蓝色号码为："  + userBlueBall);
		
	}
	//冒泡排序
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
	
	//用于在指定数列中，随机生成多个不重复的数算法 
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
