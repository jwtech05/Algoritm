package 해쉬.학급회장;

import java.util.*;

public class Main {
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> HM = new HashMap<>();
		for(int i=0; i<n; i++) {
			HM.put(str.charAt(i), HM.getOrDefault(str.charAt(i), 0)+1);
		}
		int m = Integer.MIN_VALUE;
		for(char x : HM.keySet()) {
			if(HM.get(x) > m) {
				m = HM.get(x);
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		String str = scan.next();
		System.out.print(T.solution(n, str));
	}
}
