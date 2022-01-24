package ÁÂÇ¥Á¤·Ä;

import java.util.*;

class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x= scan.nextInt();
			int y= scan.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x+" "+o.y);
	}
}
