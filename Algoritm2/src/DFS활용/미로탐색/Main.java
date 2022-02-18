package DFS활용.미로탐색;

import java.util.*;

public class Main {
	static int n = 7, answer = 0;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] arr;
	public void DFS(int x, int y) {
		if(x == n && y == n) {
			answer++;
		}else {
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if( nx >= 1 && nx <=7 && ny >= 1 && ny <= 7 && arr[nx][ny]== 0) {
					arr[nx][ny] = 1; 
					DFS(nx, ny);
					arr[nx][ny] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		arr = new int[n+1][n+1];
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		arr[1][1] = 1;
		T.DFS(1,1);
		System.out.print(answer);
	}
}
