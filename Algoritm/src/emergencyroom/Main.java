package emergencyroom;

import java.util.*;

public class Main {
	public int solution(int n, int m, int[] ep) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] ep = new int[n];
		for(int i=0; i<n; i++) {
			ep[i] = scan.nextInt();
		}
		System.out.print(T.solution(n, m, ep));
	}
}
