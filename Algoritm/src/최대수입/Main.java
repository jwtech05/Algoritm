package 최대수입;

import java.util.*;

class Lecture implements Comparable<Lecture>{
	public int money, date;
	Lecture(int money, int date){
		this.money = money;
		this.date = date;
	}
	@Override
	public int compareTo(Lecture o) {
		return o.date - this.date;
	}
}

public class Main {
	static int max;
	public int solution(ArrayList<Lecture> arr , int n) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j=0;
		for(int i=max; i>=1; i--) {
			for(; j<n; j++) {
				if(arr.get(j).date<i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer+=pQ.poll();
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
			int d = scan.nextInt();
			arr.add(new Lecture(m,d));
			if(d>max) max = d;
		}
		System.out.print(T.solution(arr, n));
	}
}
