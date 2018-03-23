import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String first = name.substring(0, name.indexOf(' '));
		String last = name.substring(name.indexOf(' ') + 1);
		
		char letter = last.charAt(0);
		String str = first.charAt(0) + "";
		int i = 1;
		while (i < first.length() && first.charAt(i) < letter) {
			str += first.charAt(i);
			i++;
		}
		str += letter;
		System.out.println(str);
	}
}
