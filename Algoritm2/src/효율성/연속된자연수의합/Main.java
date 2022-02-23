package 효율성.연속된자연수의합;

import java.util.*;

public class Main {
	public int solution(int n) {
		int m =( n / 2) + 1;
		int[] arr = new int[m+1];
		for(int i=1; i<=m; i++) arr[i] = i;
		int lt= 1, rt = 1;
		int cnt = 0, answer = 0;
		while(lt < m || rt < m+1) {
			if(cnt == n) {
				answer++;
				cnt -= arr[lt++];
			}
			else if(cnt < n) {
				cnt += arr[rt++];
			}else {
				cnt -= arr[lt++];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print(T.solution(n));
	}
}
