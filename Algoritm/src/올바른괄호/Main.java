package ¿Ã¹Ù¸¥°ýÈ£;

import java.util.*;

public class Main {
	public String solution(String b) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(char x: b.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String b = scan.next();
		System.out.println(T.solution(b));
	}
}
