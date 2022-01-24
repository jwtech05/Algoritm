package 중복확인;

import java.util.*;

public class Main {
	public String solution(int n, int[] like) {
		String answer = "U";
		Arrays.sort(like);
		for(int i=0; i<n-1; i++) {
			if(like[i]==like[i+1]) return "D";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] like = new int[n];
		for(int i=0; i<n; i++) like[i] = scan.nextInt();
		System.out.print(T.solution(n, like));
	}
}
