package 배열.큰수출력하기;

import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int[] num, int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(num[0]);
		for(int i=1; i<n; i++) {
			if(num[i-1] < num[i]) {
				answer.add(num[i]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		for(int x : T.solution(num, n)) {
			System.out.print(x+" ");
		}
	}
}
