package DFS����.���������;

import java.util.*;

public class Main {
	public void DFS(int n) {
		if(n == 1) {
			System.out.print(n);
			return;
		}
		else {
			DFS(n/2); 
			System.out.print(n%2);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		T.DFS(n);
	}
}
