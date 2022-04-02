package kakaot;

import java.io.*;
import java.util.*;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Main {
	static char[][] forest;
	static int[] st, ed;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] dis;
	public void BFS(int x, int y) {
		dis = new int[10][10];
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x +dx[i];
				int ny = tmp.y +dy[i];
				if(nx >= 0 && nx< 10 && ny >= 0 && ny < 10 && (forest[nx][ny] == '.' ||forest[nx][ny] == 'M')) {
					forest[nx][ny]=' ';
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		Main K = new Main();
		Scanner scan = new Scanner(System.in);
		String a = "";
		forest = new char[10][10];
		for(int i=0; i<10; i++){
			a = scan.next();
			for(int j=0; j<10; j++){
				forest[i][j] = a.charAt(j);
			}
		}

		 st = new int[2]; 
		 ed = new int[2]; 
		 for(int i=0; i<10; i++){
			 for(int j=0; j<10; j++){ 
				 if(forest[i][j] == 'H'){ 
					 st[0] = i; st[1] = j; 
				 }else if(forest[i][j] == 'M'){ 
					 ed[0] = i; ed[1] = j; 
					 } 
				 } 
			 } 
		 for(int i= 0 ; i<2; i++) { 
			 System.out.println(st[i]+" "+ed[i]); 
			 }
		 K.BFS(st[0],st[1]);
		 System.out.print(dis[ed[0]][ed[1]]-1);
	}
}