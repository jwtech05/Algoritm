package ¾¾¸§¼±¼ö;

import java.util.*;

class Point implements Comparable<Point> {
	public int h, w;
	Point(int h, int w){
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Point o) {
		return o.h - this.h;
	}
}

public class Main {
	public int solution(ArrayList<Point> arr, int n) {
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);
		for(Point x: arr) {
			if(x.w > max) {
				cnt ++;
				max = x.w;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr.add(new Point(x,y));
		}
		System.out.print(T.solution(arr,n));
	}
}
