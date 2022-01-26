package °áÈ¥½Ä;

import java.util.*;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	Time(int time, char state){
		this.time = time;
		this.state = state;
	}
	public int compareTo(Time o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time-o.time;
	}
}

public class Main {
	public int solution(ArrayList<Time> arr, int n) {
		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(arr);
		for(Time x : arr) {
			if(x.state == 's') cnt++;
			else cnt-- ;
			answer = Math.max(cnt, answer);	
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int sT = scan.nextInt();
			int eT = scan.nextInt();
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}
		System.out.print(T.solution(arr, n));
	}
}
