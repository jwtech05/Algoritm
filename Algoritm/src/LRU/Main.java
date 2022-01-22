package LRU;

import java.util.*;

public class Main {
	public int[] solution(int s, int n, int[] rd) {
		int[] cache = new int[s];
		for(int i=0; i<n; i++) {
			for(int j=0; j<s; j++) {
				if(cache[i] == 0 && rd[i] != cache[j]) cache[i] = rd[i];
				else if(rd[i] == cache[j]) {
					int tmp = cache[j];
					cache[j] = cache[0];
					cache[0];
				}
			}
		}
		return cache;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int s= scan.nextInt();
		int n= scan.nextInt();
		int[] rd = new int[n];
		for(int i=0; i<n; i++) rd[i] = scan.nextInt();
		for(int x: T.solution(s,n, rd)) System.out.print(x+" ");
	}
}
