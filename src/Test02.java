
public class Test02 {
	public static void main(String[] args) {
		int [] scores = {1,20,301,400};
		System.out.println("���鳤�ȣ�" + scores.length);
		//����
		int len =scores.length;	//�ȶ���һ����������length�������ж��е�i<lenֱ���жϣ�����ÿ��
								//��ȥ�������ٴ�ȡֵ��
		for(int i = 0; i < len ; i++) {
			int score = scores[i];
			System.out.println(score);
		}
		
		System.out.println("------------------------------------");
		//foreach
		for(int x:scores) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		//print(scores);
		//prints(20,30,40,50,60);
		//print3(null);	
		print4(scores);
		
		//new�ؼ��ֱ�ʾ����һ������
		int[] nums = new int[] {1,2,3,4,5};
		
	}
	
	public static void print(int[] x){
		int len = x.length;
		for(int i = 0; i<len; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void prints(int...x) {
		int len = x.length;
		for(int i = 0; i<len; i++) {
			System.out.println(x[i]);
		}
	}
	//����������쳣NullPointerException(��ָ��)
	public static void print3(int[] x) {
		/*	Exception in thread "main" java.lang.NullPointerException	//��ָ���쳣
	 	��һ������ΪNull(û�и�ֵʱ)ʱ������ȥ�����˸ñ��������Ժͷ���	*/
		System.out.println("����ĳ���Ϊ��" + x.length);
	}
	//���������±��Խ��
	public static void print4(int[] x) {
		for(int i = 0; i<x.length; i++) {
			System.out.println(x[i]);}
		}
}
