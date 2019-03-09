import java.util.Scanner;
public class PrintABC {
	public static void main(String[] args) {
		char[] c = {'a','b','c','d','e','f'};
		int len = c.length;
		for(int i =1; i <=len; i++) {
			for(int j =i; j<len; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1; j++) {
				System.out.print(c[i-1]);
			}
			System.out.println();
		}
	}
}
