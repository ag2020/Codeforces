import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemOne {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		InputReader ir = new InputReader(System.in);
		int n = ir.nextInt();
		String s = ir.next();
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '?') {
				System.out.println("No");
				return;
			}
		}
		
		int i = 0;
		while (i < n) {
			if (s.charAt(i) == '?' && (i == 0 || i == n - 1 || (s.charAt(i + 1) == '?' || s.charAt(i - 1) == s.charAt(i + 1)))) {
				System.out.println("Yes");
				return;
			}
			i++;
		}
		
		System.out.println("No");
	}
}

class InputReader {
	
	public BufferedReader br;
    public StringTokenizer st;
    
	public InputReader(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is), 32768);
        st = null;
    }
	
	public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }
	
	public int nextInt() {
        return Integer.parseInt(next());
    }
}
