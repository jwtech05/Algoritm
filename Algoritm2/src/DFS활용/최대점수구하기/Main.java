package DFS활용.최대점수구하기;

import java.util.*;

class Quiz {
	int s,t;
	Quiz(int s, int t){
		this.s = s;
		this.t = t;
	}
	/*
	 * @Override public int compareTo(Quiz o) { return this.s - o.s; }
	 */
}

public class Main {
	static int n, m;
	static int answer= Integer.MIN_VALUE;
	public void DFS(int L, int sum, int time, ArrayList<Quiz> arr) {
		if(time>m) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr.get(L).s, time+arr.get(L).t, arr);
			DFS(L+1,sum, time, arr);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ArrayList<Quiz> arr= new ArrayList<>();
		for(int i=0; i<n; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			arr.add(new Quiz(s,t));
		}
		T.DFS(0, 0, 0, arr);
		System.out.print(answer);
	}
}
