package lecture;

import java.util.*;

public class Main {
	public String solution(String cs, String s) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x: cs.toCharArray()) Q.offer(x);
		for(char x: s.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String cs = scan.next();
		String s = scan.next();
		System.out.print(T.solution(cs, s));
	}
}
