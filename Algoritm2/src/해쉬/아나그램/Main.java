package 해쉬.아나그램;

import java.util.*;

public class Main {
	public String solution(String n, String m) {
		String answer = "YES";
		HashMap<Character, Integer> HM = new HashMap<>();
		for(char x: n.toCharArray()) {
			HM.put(x, HM.getOrDefault(x, 0)+1);
		}
		for(char x: m.toCharArray()) {
			HM.put(x, HM.getOrDefault(x, 0)-1);
		}
		for(char x: HM.keySet()) {
			if(HM.get(x) != 0) answer ="NO";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String m = scan.next();
		System.out.print(T.solution(n,m));
	}
}
