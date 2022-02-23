package 스택큐.쇠막대기;

import java.util.*;

public class Main {
	public int solution(String str) {
		Stack<Character> cut = new Stack<>();
		int answer = 0, cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				cut.push(str.charAt(i));
				cnt ++;
			}
			else if(str.charAt(i) ==')' && str.charAt(i-1) == '(') {
				cnt --;
				answer += cnt;
				cut.pop();
			}else if(str.charAt(i)==')') {
				answer ++;
				cnt--;
				cut.pop();
			}
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
