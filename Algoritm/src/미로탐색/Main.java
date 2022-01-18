package ¹Ì·ÎÅ½»ö;

import java.util.*;

public class Main {
	static int[] dx= {-1, 0, 1, 0};
	static int[] dy= {0, 1, 0, -1};
 	static int cnt, answer =Integer.MAX_VALUE;
	static int[][] matrix = new int[8][8];
	public void DFS(int L, int R) {
		if(L==7 && R ==7 ) {
			answer = Math.min(cnt, answer);
		}else {
			for(int i=0; i<4; i++) {
				int nx=L+dx[i];
				int ny=R+dy[i];
				if(nx>=1 && nx<=7 && ny >=1 && ny <=7 && matrix[nx][ny]==0) {
					matrix[nx][ny] = 1;
					DFS(nx, ny);
					matrix[nx][ny] = 0;
				}
			}
			cnt++;
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		matrix[1][1] = 1;
		T.DFS(1,1);
		System.out.println(cnt);
		System.out.print(answer);
	}
}
