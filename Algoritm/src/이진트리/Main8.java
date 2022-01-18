package 이진트리;

import java.util.*;

class Main8 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v) {
		ch[v]=1;
		dis[v]=0;
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv]==0) {
					ch[cv]=1;
					queue.offer(cv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main8 cat = new Main8();
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		graph= new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph.get(a).add(b);
		}
		cat.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : "+dis[i]);
		}
	}

}


