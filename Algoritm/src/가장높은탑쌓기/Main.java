package 가장높은탑쌓기;

import java.util.*;

class Top implements Comparable<Top>{
	int b;
	int h;
	int w;
	Top(int b, int h, int w){
		this.b = b;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Top o) {
		return o.b - this.b;
	}
}

public class Main {
	static int[] dy;
	public int solution(ArrayList<Top> arr, int n) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h;
		answer = dy[0];
		for(int i=1; i<arr.size() ;i++) {
			int max_h = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j]>max_h) {
					max_h = dy[j];
				}
			}
			dy[i] = arr.get(i).h+ max_h;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Top> arr = new ArrayList<>();
		dy = new int[n];
		for(int i=0; i<n; i++) {
			int b = scan.nextInt();
			int h = scan.nextInt();
			int w = scan.nextInt();
			arr.add(new Top(b,h,w));
		}
		System.out.print(T.solution(arr, n));
	}
}
