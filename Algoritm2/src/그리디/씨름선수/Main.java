package 그리디.씨름선수;

import java.util.*;

class Info implements Comparable<Info>{
	public int h, w;
	Info(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Info o) {
		return o.w - this.w;
	}

}

public class Main {
	static int a, b, answer=0;
	static ArrayList<Info> Q; 
	
	public void solution() {
		Collections.sort(Q);
		int tmp = 0;
		for(Info x: Q) {
			if(x.h > tmp) {
				answer++;
				tmp = x.h;
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Q = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			Q.add(new Info(a,b));
		}
		T.solution();
		System.out.print(answer);
	}
}
