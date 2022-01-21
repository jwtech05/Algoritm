package emergencyroom;

import java.util.*;

class Order{
	int x, pt;
	Order(int x, int pt) {
		this.x = x;
		this.pt = pt;
	}
}

public class Main {
	public int solution(int n, int m, int[] er) {
		int answer=0;
		Queue<Order> Q = new LinkedList<>();
		for(int i=0; i<n; i++) Q.offer(new Order(i, er[i]));
		while(!Q.isEmpty()) {
			Order tmp = Q.poll();
			for(Order x : Q) {
				if(x.pt > tmp.pt) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.x==m) return answer;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] er = new int[n];
		for(int i=0; i<n; i++) {
			er[i] = scan.nextInt();
		}
		System.out.println(T.solution(n, m, er));
	}
}
