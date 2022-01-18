package 괄호문자제거;

import java.util.*;

public class Main {
	public String solution(String a) {
		String answer ="";
		Stack<Character> stack = new Stack<>();
		for(char x: a.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}else
				stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String alpha = scan.next();
		System.out.print(T.solution(alpha));
	}
}
