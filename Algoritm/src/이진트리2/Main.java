package 이진트리2;

import java.util.*;

public class Main {
	static String answer = "NO";
	static int n, total=0;
	static int[] ch;
	boolean flag = false;
	public void DFS(int L, int sum, int[] ch) {
		if(flag) return;
		if(sum>total/2) return;
		if(L==n) {
			if((total-sum) == sum) {
				answer ="YES";
				flag = true;
			}
		}else {
			DFS(L+1, sum+ch[L], ch);
			DFS(L+1, sum, ch);
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		ch = new int[n];
		for(int i=0;i<n; i++) {
			ch[i] = scan.nextInt();
			total += ch[i];
		}
		T.DFS(0,0,ch);
		System.out.println(answer);
	}
}
