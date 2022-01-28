package 최대점수;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] dy= new int[m+1];
		for(int i=0; i<n; i++) {
			int ps=scan.nextInt();
			int pt=scan.nextInt();
			for(int j=m; j>=pt; j--) {
				dy[j]=Math.max(dy[j], dy[j-pt]+ps);
				
			}
		}
		System.out.println(dy[m]);
	}
}
