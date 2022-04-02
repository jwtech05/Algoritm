package kakao1;

import java.util.*;

public class Main {
	public int[] solution(int n, int m, int k) {
		int cnt = 0;
		int max = 0;
		int min = 0;
		int[] answer = new int[2];
		while(Math.abs(n-m) != 1 && Math.abs(m-k) != 1) {
			if(m != k-1) {
				if(n < m) {
					n = m+1;
				}else if(m < n) {
					m = n+1;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main K = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		K.solution(n,m,k);
	}
}