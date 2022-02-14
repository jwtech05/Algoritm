package 스택큐.크레인인형뽑기;

import java.util.*;

public class Main {
	public int solution(int n, int m, int[][] board, int[] moves) {
		Stack<Integer> cnt = new Stack<>();
		int answer = 0;
		for(int i=0; i<n; i++) { 
			if(board[i][moves[0]-1] != 0) {
				cnt.push(board[i][moves[0]-1]);
				board[i][moves[0]-1] = 0;
				break;
			}
		}
		for(int i=1; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(cnt.peek() == board[j][moves[i]-1]) {
						answer += 2;
						cnt.pop();
					}else {
						cnt.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) moves[i] = scan.nextInt();
		System.out.print(T.solution(n, m, board, moves));
		
	}
}
