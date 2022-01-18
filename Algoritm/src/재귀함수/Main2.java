package Àç±ÍÇÔ¼ö;

public class Main2 {
	public void DFS(int n) {
		if(n < 1) return;
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		T.DFS(11);
	}
}
