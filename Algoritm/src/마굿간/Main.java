package ¸¶±Â°£;

import java.util.*;

class Point{
	int x, y;
	Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static ArrayList<Point> home = new ArrayList<>();
	public int solution(int n ,int c, int[] h) {
		int answer = 0;
		Arrays.sort(h);
		int lt = Arrays.stream(h).min().getAsInt();
		int rt = Arrays.stream(h).max().getAsInt();
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			while(lt <= rt) {
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		int[] h = new int[n];

		for(int i=0; i<n; i++) { 
			h[i] = scan.nextInt();
			home.add(new Point(0,h[i]));
		}
		System.out.print(T.solution(n, c, h));
	}
}
