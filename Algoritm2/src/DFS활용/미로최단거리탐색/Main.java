package DFS활용.미로최단거리탐색;

import java.util.*;

class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] arr, dis;
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >=1 && nx<=7 && ny >=1 && ny <= 7 && arr[nx][ny]==0) {
					arr[nx][ny]= 1;
					Q.offer(new Point(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		arr = new int[8][8];
		dis = new int[8][8];
		for(int i=1; i<8; i++) {
			for(int j=1; j<8; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		arr[1][1] = 1;
		T.BFS(1,1);
		if(arr[7][7] == 0) System.out.print(-1);
		else System.out.print(dis[7][7]);
	}
}
