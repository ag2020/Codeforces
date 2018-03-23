import java.util.Scanner;

public class ProblemOne {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] pos = new boolean[m + 1];
		pos[0] = true;
		int start, end;
		boolean b = true;
		for (int i = 0; i < n; i++) {
			start = sc.nextInt();
			end = sc.nextInt();
			if (pos[start]) {
				for (int j = start; j <= end; j++) {
					pos[j] = true;
				}
			}
			if (pos[m]) {
				System.out.println("YES");
				b = false;
				break;
			}
		}
		
		if (b) {
			System.out.println("NO");
		}
	}
}
