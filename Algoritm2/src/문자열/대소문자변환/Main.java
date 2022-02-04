package 문자열.대소문자변환;

import java.util.Scanner;

public class Main {
	public String solution(String w) {
		String answer ="";
		for(char x: w.toCharArray()) {
			if(x>=97 && x<=122) answer += (char)(x-32);
			else if(x>=65 && x<=90) answer += (char)(x+32);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		System.out.print(T.solution(w));
	}
}
