package 이진트리2;

import java.util.Scanner;

public class Main5 {
	static int n, cg , answer=Integer.MAX_VALUE;
	static int[] coin;
	public void DFS(int L, int total, int[] coin) {
		if(total> cg) return;
		if(total == cg) {
				answer = Math.min(answer, L);
			}
		else {
			for(int i=0; i<n; i++) {
				DFS(L+1, total+coin[i], coin);
			}
		}
	}
	public static void main(String[] args) {
		Main5 T = new Main5();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		coin = new int[n];
		for(int i=0; i<n; i++) {
			coin[i] = scan.nextInt();
		}
		cg = scan.nextInt();
		T.DFS(0,0, coin);
		System.out.println(answer);
	}
}
