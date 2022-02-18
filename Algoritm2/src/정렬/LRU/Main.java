package Á¤·Ä.LRU;

import java.util.*;

public class Main {
	public int[] solution(int s, int n, int[] a) {
		int[] c = new int[s];
		for(int x: a) {
			int pos = -1;
			for(int i=0; i<s; i++) if(x == c[i]) pos=i;
			if(pos == -1) {
				for(int i=s-1; i>=1; i--) {
					c[i] = c[i-1];
				}
			}else {
				for(int i=pos; i>=1; i--) {
					c[i] = c[i-1];
				}
			}
			c[0] = x;
		}
		return c;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		for(int y: T.solution(s, n, arr)) {
			System.out.print(y+" ");
		};
	}
}
