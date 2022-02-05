package 배열.보이는학생;

import java.util.*;

public class Main {
	public int solution(int[] stu, int n) {
		int answer = 1, m= stu[0];
		for(int i=1; i<n; i++) {
			if(m < stu[i]) {
				answer++;
				m = stu[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] stu = new int[n];
		for(int i=0; i<n; i++) {
			stu[i] = scan.nextInt();
		}
		System.out.print(T.solution(stu, n));
	}
}
