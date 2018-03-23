import java.util.Scanner;
public class ProblemOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] scores = new int[601];
		for (int i = 0; i < n; i++) {
			scores[sc.nextInt()]++;
		}
		
		int count = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
