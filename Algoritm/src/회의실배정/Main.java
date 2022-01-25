package 회의실배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	public int s,e;
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e; 
	}
}

public class Main {
	public int solution(ArrayList<Time> arr, int n) {
		int answer = 0;
		int max = 0;
		Collections.sort(arr);
		for(Time x : arr) {
			if(x.s >= max) {
				answer++;
				max = x.e;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			arr.add(new Time(s,e));
		}
		System.out.print(T.solution(arr, n));
	}
}
