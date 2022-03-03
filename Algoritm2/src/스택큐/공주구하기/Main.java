package 스택큐.공주구하기;

import java.util.*;

public class Main {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=n; i++) Q.offer(i);
		int tmp = 0, a=0;
		while(!Q.isEmpty()) {
			tmp ++;
			a = Q.poll();
			if(tmp%k!=0) {
				Q.offer(a);
			}
		}
		answer = a;
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.print(T.solution(n, k));
	}
}
