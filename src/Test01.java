
public class Test01 {
	public static void main(String[] args) {
		//第一种
		int [] nums = new int[5];
		for(int i = 0; i < 5; i++) {
			nums[i] = i + 1;
		}
		System.out.println(nums);
		
		//第二种
		int [] nums2;
		nums2 = new int[5];
		
		//第三种
		int[] nums3 = new int[] {1,2,3,4,5};
		
		//第四种
		int[] nums4 = {1,2,3,4,5};
	}
}
