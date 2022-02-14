package DFS기초.팩토리얼;

import java.util.*;

public class Main {
	public void DFS(int L, int sum) {
		if(L==1) {
			System.out.print(sum);
			return;
		}
		else {
			DFS(L-1, sum*L);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		T.DFS(n, 1);
	}
}
