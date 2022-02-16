package 해쉬.모든아나그램찾기;

import java.util.*;

public class Main {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> HM1 = new HashMap<>();
		HashMap<Character, Integer> HM2 = new HashMap<>();
		for(int i=0; i<t.length(); i++) HM1.put(s.charAt(i), HM1.getOrDefault(s.charAt(i), 0)+1);
		for(char x: t.toCharArray()) HM2.put(x, HM2.getOrDefault(x, 0)+1);
		int lt=0, rt=t.length();
		for(int i=0; i<s.length()-t.length(); i++) {
			if(HM1.equals(HM2)) answer++;
			HM1.put(s.charAt(lt), HM1.getOrDefault(s.charAt(lt), 0)-1);
			if(HM1.get(s.charAt(lt)) == 0) HM1.remove(s.charAt(lt));
			HM1.put(s.charAt(rt), HM1.getOrDefault(s.charAt(rt), 0)+1);
			lt++;
			rt++;
		}
		if(HM1.equals(HM2)) answer++;
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		System.out.print(T.solution(s, t));
	}
}
