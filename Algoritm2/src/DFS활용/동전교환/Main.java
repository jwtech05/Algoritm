package DFS활용.동전교환;

import java.util.*;

public class Main {
	static int[] arr;
	static int n, m;
	static int answer = Integer.MAX_VALUE;
	public void DFS(int L, int sum) {		
		if(L > answer) return;
		if(sum > m) return;
		if(sum == m) {
			answer = Math.min(L, answer);
		}else {
			for(int i=n-1; i>=0; i--) {
				DFS(L+1, sum+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		m = scan.nextInt();
		T.DFS(0,0);
		System.out.print(answer);
	}
}
