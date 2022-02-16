package DFS기초.피보나치수열;

import java.util.*;

public class Main {
	static int n;
	static int[] arr;
	public int DFS(int L) {
		if(arr[L]>0) return arr[L];
		if(L==1) return arr[L] = 1;
		else if(L == 2) return arr[L]= 1;
		else return arr[L] = DFS(L-1) + DFS(L-2);
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++)System.out.print(arr[i]+" ");
	}
}
