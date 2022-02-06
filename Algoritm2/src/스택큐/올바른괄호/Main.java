package 스택큐.올바른괄호;

import java.util.*;

public class Main {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> st = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') {
				st.push(x);
			}else {
				if(st.isEmpty()) return "NO";
				st.pop();
			}
		}
		if(!st.isEmpty()) answer = "NO";
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(T.solution(str));
	}
}
