package ¹Ì·ÎÅ½»ö;

import java.util.*;

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main2 {
	static int[][] board, dis;
	static int[] nx = {-1,0,1,0};
	static int[] ny = {0,1,0,-1};
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		board[x][y]=1;
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int dx = tmp.x+ nx[i];
				int dy = tmp.y+ ny[i];
				if(dx>=1 && dx<=7 && dy>=1 && dy<=7 && dis[dx][dy]==0) {
					board[dx][dy] = 1;
					Q.offer(new Point(dx,dy));
					dis[dx][dy] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		T.BFS(1,1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}
}
