package postfix;

import java.util.*;

public class Main {
	public int solution(String post) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(char x: post.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				int lt = stack.pop();
				int rt = stack.pop(); 
				if(x == '+') stack.push(rt + lt);
				else if(x == '-') stack.push(rt - lt);
				else if(x == '*') stack.push(rt * lt);
				else if(x == '/') stack.push(rt / lt);
			}
		}
		answer=stack.get(0);
		return answer;
	}
	public static void main(String args[]) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String post = scan.next();
		System.out.print(T.solution(post));
	}
}
