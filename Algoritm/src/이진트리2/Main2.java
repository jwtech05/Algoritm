package 이진트리2;

import java.util.*;

public class Main2 {
	static int c, n, answer=0;
	static int[] w;
	public void DFS(int L, int sum, int[] w) {
		if(sum>c) return;
		if(L == n) {
			answer=Math.max(answer, sum);
		}else {
			DFS(L+1, sum+w[L], w);
			DFS(L+1, sum, w);
		}
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		w = new int[n];
		for(int i=0;i<n; i++) {
			w[i] = scan.nextInt();
		}
		T.DFS(0,0,w);
		System.out.println(answer);
	}
}
