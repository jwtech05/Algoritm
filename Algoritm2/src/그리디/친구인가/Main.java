package 그리디.친구인가;

import java.util.*;

public class Main {
	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]);
	}
	public static void Union(int a, int b) {
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]= fb;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		unf = new int[n+1];
		for(int i=1; i<=n; i++) unf[i] = i;
		for(int i=1; i<=m; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			Union(a,b);
		}
		int a= scan.nextInt();
		int b= scan.nextInt();
		int fa= Find(a);
		int fb= Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
	}
}
   