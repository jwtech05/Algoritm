package 돌다리건너기;

import java.util.*;

public class Main {
	static int[] road;
	public int solution(int n) {
		road[1] = 1;
		road[2] = 2;
		for(int i=3; i<=n+1; i++) {
			road[i] = road[i-2]+road[i-1];
		}
		return road[n+1];
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		road= new int[n+2];
		System.out.print(T.solution(n));
	}
}
