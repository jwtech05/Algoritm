package 동적.동전교환;

import java.util.*;

public class Main {
	static int n, m;
	static int[] arr;
	public int solution() {
		int[] dis = new int[m+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[0]=0;
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<=m; j++) {
				dis[j]= Math.min(dis[j], dis[j-arr[i]]+1);
			}
		}
		return dis[m];
 	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) arr[i]= scan.nextInt();
		m = scan.nextInt();
		System.out.print(T.solution());
	}
}
