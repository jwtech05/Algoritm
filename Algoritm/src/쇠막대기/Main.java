package ¼è¸·´ë±â;

import java.util.*;

public class Main {
	public int solution(String iron) {
		int answer=0;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<iron.length(); i++) {
			if(iron.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(iron.charAt(i-1)=='(') answer+=stack.size();
				else answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String iron = scan.next();
		System.out.print(T.solution(iron));
	}
}
