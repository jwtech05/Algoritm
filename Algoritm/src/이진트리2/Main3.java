package 이진트리2;

import java.util.*;

public class Main3 {
	static int n, m, answer=Integer.MIN_VALUE, total=0;
	static int[] score, time;
	public void DFS(int L, int sum, int total, int[] score, int[] time) {
		if(L==n) {
			if(sum <= m){
				answer = Math.max(answer, total);
			}
		}else {
			DFS(L+1, sum+time[L], total+score[L], score, time);
			DFS(L+1, sum, total, score, time);
		}
	}
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		score = new int[n];
		time = new int[n];
		for(int i=0; i<n; i++) {
			score[i] =scan.nextInt();
			time[i] = scan.nextInt();
		}
		T.DFS(0,0,0,score,time);
		System.out.println(answer);
	}
}
