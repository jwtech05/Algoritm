package 문자열.문자찾기;

import java.util.Scanner;

public class Main {
	
	public int solution(String n, char m) {
		int answer = 0;
		n = n.toLowerCase();
		m = Character.toLowerCase(m);
		for(char x: n.toCharArray()) {
			if(x == m) answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		char m = scan.next().charAt(0);
		System.out.print(T.solution(n, m));
	}
}
