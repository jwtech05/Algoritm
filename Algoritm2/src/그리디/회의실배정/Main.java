package 그리디.회의실배정;

import java.util.*;

class Room implements Comparable<Room>{
	public int s, e;
	Room(int s, int e){
		this.s = s;
		this.e = e;
	}
	@Override
	public int compareTo(Room o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

public class Main {
	static ArrayList<Room> arr = new ArrayList<>();
	static int answer = 0;
	public void solution() {
		Collections.sort(arr);
		int tmp = 0;
		for(Room x : arr) {
			if(x.s >= tmp) {
				answer++;
				tmp = x.e;
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			arr.add(new Room(s,e));
		}
		T.solution();
		System.out.print(answer);
	}
}
