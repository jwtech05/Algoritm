package DFSÈ°¿ë.¹ÙµÏÀÌ½ÂÂ÷;

import java.util.*;

public class Main {
	static int n, c;
	static int answer= Integer.MIN_VALUE;
	public void DFS(int L, int sum, int[] dog) {
		if(sum > c) return;
		if(L == n) {
			answer=Math.max(answer, sum);
		}else {
			DFS(L+1, sum+dog[L], dog);
			DFS(L+1, sum, dog);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		int[] dog = new int[n];
		for(int i=0; i<n; i++) dog[i] = scan.nextInt();
		T.DFS(0,0, dog);
		System.out.println(answer);
	}
}
