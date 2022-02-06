package DFS활용.합이같은부분집합;

import java.util.*;
 
public class Main {
	static String answer = "NO";
	static int[] arr;
	static int n, ch=0;
	Boolean flag=false;
	public void DFS(int L,int sum) {
		if(flag) return;
		if(sum> ch/2) return;
		if(L == n) {
			if(sum == (ch-sum)) {
				answer = "YES";
				flag=true;
			}
		}else {
			DFS(L+1, sum+arr[L]);
			DFS(L+1, sum);
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan= new Scanner(System.in);
		n = scan.nextInt();
		int sum = 0;
		arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		for(int i=0; i<n; i++) ch += arr[i];
		T.DFS(0, 0);
		System.out.print(answer);
	}
}
