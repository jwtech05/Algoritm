package 섬나라아일랜드;

import java.util.*;

class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static int n, answer=0;
	static int[][] board;
	static int[] dx = {-1,0,1,0,1,-1,1,-1};
	static int[] dy = {0,1,0,-1,1,1,-1,-1};
	static Queue<Point> Q = new LinkedList<>();
	public void BFS(int x, int y, int[][] board) {
		Q.offer(new Point(x,y));
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i<8; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx >= 0 && nx<n && ny >=0 && ny<n && board[nx][ny]==1) {
					board[nx][ny] = 0;
					Q.offer(new Point(nx, ny));
				}
			}
		}
	}
	public void solution(int[][] board){
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		T.solution(board);
		System.out.println(answer);
	}
}
