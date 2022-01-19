package 크레인인형뽑기;

import java.util.*;

public class Main {
	static int[][] board;
	static int[] moves;
	public int solution(int n, int m) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(board[j][moves[i]-1] != 0) {
					int tmp = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					if(!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					}
					else stack.push(tmp);
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
		board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();
		moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = scan.nextInt();
		}
		System.out.print(T.solution(n, m));
	}
}
