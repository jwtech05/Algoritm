package ≈‰∏∂≈‰;

import java.util.*;

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
		static int n, m;
		static int[][] board, dis;
		static int[] nx = {-1,0,1,0};
		static int[] ny = {0,1,0,-1};
		static Queue<Point> Q = new LinkedList<>();
		
		public void BFS() {
			while(!Q.isEmpty()) {
				Point tmp = Q.poll();
				for(int i=0; i<4; i++) {
					int dx = tmp.x+nx[i];
					int dy = tmp.y+ny[i];
					if(dx>=0 && dx<n && dy>=0 && dy<m && board[dx][dy]==0) {
						board[dx][dy]=1;
						Q.offer(new Point(dx, dy));
						dis[dx][dy] = dis[tmp.x][tmp.y]+1;
					}
				}
			}
		}
		public static void main(String[] args) {
			Main T = new Main();
			Scanner scan = new Scanner(System.in);
			m = scan.nextInt();
			n = scan.nextInt();
			board = new int[n][m];
			dis = new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					board[i][j] = scan.nextInt();
					if(board[i][j]==1) Q.offer(new Point(i,j));
				}
			}
			T.BFS();
			boolean flag = true;
			int a; 
			int answer=Integer.MIN_VALUE;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(board[i][j] == 0) {
						flag = false;
					}
				}
			}
			if(flag) {
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						answer= Math.max(answer, dis[i][j]);
					}
				}
				System.out.println(answer);
			}else System.out.println(-1);
			}
	}

