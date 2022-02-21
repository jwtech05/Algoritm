package 동적.가장높은탑쌓기;

import java.util.*;

class Block implements Comparable<Block>{
	int b, h, w;
	public Block(int b, int h, int w) {
		this.b = b;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Block o) {
		return o.b > this.b ? 1 : -1;
	}
}

public class Main {
	public int solution(int n, ArrayList<Block> arr) {
		Collections.sort(arr);
		int answer = 0;
		int[] dy = new int[n];
		dy[0] = arr.get(0).h;
		answer = dy[0];
		for(int i=1; i<arr.size(); i++) {
			int max_h=0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){
					max_h=dy[j];
				}
			}
			dy[i]=max_h+arr.get(i).h;
			answer=Math.max(answer, dy[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Block> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int b = scan.nextInt();
			int h = scan.nextInt();
			int w = scan.nextInt();
			arr.add(new Block(b,h,w));
		}
		System.out.print(T.solution(n, arr));
	}
}
