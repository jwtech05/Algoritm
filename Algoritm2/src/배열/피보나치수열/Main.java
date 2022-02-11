package 배열.피보나치수열;

import java.util.*;

public class Main {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-1]+answer[i-2];
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int x: T.solution(n)) {
			System.out.print(x+" ");
		}
	}
}
