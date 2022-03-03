package 배열.점수계산;

import java.util.*;

public class Main {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int[] score = new int[n];
		score[0] = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] == 1 && arr[i-1] != 1) score[i] = 1;
			else if(arr[i] == 1 && arr[i-1] == 1) score[i] = score[i-1]+1;
			else arr[i] = 0;
		}
		for(int x : score) {
			answer += x;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		System.out.print(T.solution(n, arr));
	}
}
