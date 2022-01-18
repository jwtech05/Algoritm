package 이진트리;

public class Main2 {
	static int n;
	static int[] a;
	public void DFS(int L) {
		if(L == n+1) {
			String b = "";
			for(int i=1; i<=n; i++) {
				if(a[i]== 1) {
					b += (i+" ");
				}
			}
			if(b.length()>0)System.out.println(b);
		}else {
			a[L] = 1;
			DFS(L+1);
			a[L] = 0;
			DFS(L+1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		n = 3;
		a = new int[n+1];
		T.DFS(1);
	}
}
