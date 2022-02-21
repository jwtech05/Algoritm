package 문자열.회문문자열;

import java.util.*;

public class Main {
	public String solution(String str) {
		String answer = "NO";
		String str2 = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(str2)) {
			answer = "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(T.solution(str));
	}
}
