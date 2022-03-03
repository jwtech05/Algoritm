package 효율성.연속된자연수의합;

import java.util.*;

public class Main2 {
	public int solution(int n) {
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print(T.solution(n));
	}
}
