import java.util.ArrayList;
import java.util.Scanner;

public class ProblemTwo {
	
	static int steps;
	static int[] colors;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node1[] nodes = new Node1[n];
		nodes[0] = new Node1(0);
		for (int i = 1; i < n; i++) {
			Node1 n1 = new Node1(i);
			nodes[i] = n1;
			nodes[sc.nextInt() - 1].children.add(n1);
		}
		
		colors = new int[n];
		for (int i = 0; i < n; i++) {
			colors[i] = sc.nextInt();
		}
		
		steps = 0;
		check(nodes[0], 0);
		
		System.out.println(steps);
	}
	
	public static void check (Node1 n1, int newColor) {
		if (colors[n1.number] != newColor) {
			steps++;
			newColor = colors[n1.number];
		}
		
		for (Node1 n2 : n1.children) {
			check(n2, newColor);
		}
	}
}

class Node1 {
	
	int number;
	ArrayList<Node1> children;
	
	public Node1 (int num) {
		number = num;
		children = new ArrayList<Node1>();
	}
}
