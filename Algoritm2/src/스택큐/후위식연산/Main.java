package 스택큐.후위식연산;

import java.util.*;

public class Main {
	public int solution(String str) {
		Stack<Integer> arr = new Stack<>();
		int answer = 0;
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) arr.push(x- 48);
			else {
				int rt = arr.pop();
				int lt = arr.pop();
				if(x=='+') arr.push(lt+rt);
				else if(x=='-') arr.push(lt-rt);
				else if(x=='*') arr.push(lt*rt);
				else if(x=='/') arr.push(lt/rt);
			}
		}
		answer = arr.get(0);
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(T.solution(str));
	}
}
