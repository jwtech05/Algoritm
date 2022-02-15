package 효율성.최대매출;

import java.util.*;

public class Main {
	public int solution(int n, int k, int[] days) {
		int price=0;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<k; i++) price+=days[i];
		answer = price;
		int lt=0;
		for(int i=k; i<n; i++) {
			price += (days[i]-days[lt++]);
			answer = Math.max(price, answer);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] days = new int[n];
		for(int i=0; i<n; i++) days[i] = scan.nextInt();
		System.out.print(T.solution(n,k,days));
	}
}
