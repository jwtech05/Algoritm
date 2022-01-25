package ¹ÂÁ÷ºñµð¿À;

import java.util.*;

public class Main {
	public int solution(int n, int m, int[] song) {
		int answer = 0;
		int lt = 0, rt = 0;
		for(int i=0; i<n; i++) {
			lt = Math.max(song[i], lt);
			rt += song[i];
		}
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			int len =0;
			int cnt = 1;
			for(int i=0; i<n; i++) {
				if(len+song[i] > mid) {
					cnt++;
					len = song[i];
				}
				else len += song[i];
			}
			if(cnt <=m) {
				answer = mid;
				rt = mid-1;
			}
			else lt = mid+1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] song = new int[n];
		for(int i=0; i<n; i++) song[i] = scan.nextInt();
		System.out.print(T.solution(n,m,song));
	}
}
