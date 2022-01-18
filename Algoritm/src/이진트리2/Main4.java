package 이진트리2;

import java.util.Scanner;

public class Main4 {
	static int n, m;
	static int[] ch;
	public void DFS(int L) {
		if(L == m) {
			for(int x: ch) System.out.print(x+ " ");
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
				ch[L]=i;
				DFS(L+1); 
			}
		}
	}
	public static void main(String[] args) {
		Main4 T = new Main4();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch= new int[m];
		T.DFS(0);
		
	}
}
  