package Àç±ÍÇÔ¼ö;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(6);
	}

}
