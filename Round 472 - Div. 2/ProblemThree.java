import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ProblemThree {

	public static void main(String[] args) {
		InputReader ir = new InputReader(System.in);
		int n = ir.nextInt();
		int U = ir.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		int x;
		for (int i = 0; i < n; i++) {
			x = ir.nextInt();
			arr.add(x);
			tree.add(x);
		}
		
		int I, J, K;
		double max = 0;
		double d;
		for (int i = 0; i < n - 2; i++) {
			I = arr.get(i);
			J = arr.get(i + 1);
			K = tree.floor(I + U);
			if (K > J) {
				d = (K - J + 0.0) / (K - I);
				if (d > max) {
					max = d;
				}
			}
		}
		
		if (max == 0) {
			System.out.println(-1);
		} else {
			System.out.println(max);
		}
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
