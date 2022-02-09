package 스태큐.괄호제거;

import java.util.*;

public class Main {
	public String solution(String n) {
		String answer = "";
		Stack<Character> alpha = new Stack<>();
		for(char x: n.toCharArray()) {
			if(alpha.isEmpty() && Character.isAlphabetic(x)) answer+=x;
			if(x == '(') alpha.add(x);
			else if(x==')') alpha.pop();
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		System.out.print(T.solution(n));
	}
}
