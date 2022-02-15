package 그리디.결혼식;

import java.util.*;

class Time implements Comparable<Time>{
	
	int time;
	char state;
	Time(int time, char state) {
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Time o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

public class Main {
	static int n, s, e;
	public int solution(ArrayList<Time> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for(Time x: arr) {
			if(x.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			s = scan.nextInt();
			e = scan.nextInt();
			arr.add(new Time(s,'s'));
			arr.add(new Time(e,'e'));
		}
		System.out.print(T.solution(arr));
	}
}
