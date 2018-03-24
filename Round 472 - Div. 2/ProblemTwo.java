import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemTwo {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		InputReader ir = new InputReader(System.in);
		int n = ir.nextInt();
		int m = ir.nextInt();
		String s;
		boolean[][] board = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			s = ir.next();
			for (int j = 0; j < m; j++) {
				board[i][j] = (s.charAt(j) == '#') ? true : false;
			}
		}
		
		boolean[] rowDone = new boolean[n];
		boolean on, same;
		for (int i = 0; i < n; i++) {
			if (!rowDone[i]) {
				rowDone[i] = true;
				for (int j = i + 1; j < n; j++) {
					if (!rowDone[j]) {
						on = false;
						same = true;
						for (int k = 0; k < m && (same || !on); k++) {
							if (board[i][k] != board[j][k]) {
								same = false;
							}
							if (board[i][k] && board[j][k]) {
								on = true;
							}
						}
						if (on && same) {
							rowDone[j] = true;
						} else if (on && !same) {
							System.out.println("No");
							return;
						}
					}
				}
			}
		}
		System.out.println("Yes");
	}
}

class InputReader {
	
	public BufferedReader br;
    public StringTokenizer st;
    
	public InputReader (InputStream is) {
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
