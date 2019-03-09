
public class Dwshuzu {
	public static void main(String[] args) {
		int[][] scores = {{90,95,100},{80,85,89},{70,75,79}};
		int classlen = scores.length;
		for(int i = 0; i<classlen; i++) {
			int sum = 0;
			int count = scores[i].length;
			for(int j=0; j<count; j++) {
				sum+=scores[i][j];
			}
			int avg = sum/count;
			System.out.println("第" + (i+1) + "班的平均成绩是" +avg);
		}
	}
}