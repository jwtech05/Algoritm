package 이진트리;

import java.util.*;

public class Main4 {
	int answer=0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch = new int[10001];
		int L = 0;
		Q.offer(s);
		ch[s] = 1;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				for(int j=0; j<3; j++) {
					int nx = x+dis[j];
					if(x == e) return L;
					if(nx >=1 && nx <= 10001 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
					
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Main4 T = new Main4();
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		System.out.print(T.BFS(s,e));
	}
}
