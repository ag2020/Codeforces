import java.util.Scanner;
public class Codeforces465No2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int x = 0, y = 0;
		boolean side = s.charAt(0) == 'U';
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				y++;
			} else {
				x++;
			}
			if ((y > x && !side) || (x > y && side)) {
				count++;
				side = !side;
			}
		}
		System.out.println(count);
	}
}
