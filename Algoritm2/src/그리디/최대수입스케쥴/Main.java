package 그리디.최대수입스케쥴;

import java.util.*;

class Lecture implements Comparable<Lecture>{
	int m, t;
	public Lecture(int m, int t) {
		this.m = m;
		this.t = t;
	}
	@Override
	public int compareTo(Lecture o) {
		return o.t > this.t ? 1 : -1;
	}
}
public class Main {
	static int max=Integer.MIN_VALUE;
	public int solution(int n, ArrayList<Lecture> arr) {
		Collections.sort(arr);
		int answer = 0;
		int j=0;
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=max; i>0; i--) {
			for(; j<n; j++) {
				if(i > arr.get(j).t) break;
				else PQ.add(arr.get(j).m);
			}
			if(!PQ.isEmpty()) answer += PQ.poll();
		}
		return answer;
	}	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = scan.nextInt();
			int t = scan.nextInt();
			arr.add(new Lecture(m, t));
			if(t > max) max=t;
		}
		System.out.print(T.solution(n, arr));
	}
}
