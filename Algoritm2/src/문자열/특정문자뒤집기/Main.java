package 문자열.특정문자뒤집기;

import java.util.*;

public class Main {
	public String solution(String word) {
		char[] answer = word.toCharArray();
		String lastanswer;
		int lt=0, rt=word.length()-1;
		while(lt < rt) {		
			char tmp;
			if(!Character.isAlphabetic(answer[lt])) lt++;
			else if (!Character.isAlphabetic(answer[rt])) rt--; 
			else {
				tmp = answer[lt];
				answer[lt] = answer[rt];
				answer[rt] = tmp;		
				lt++;
				rt--;
			}
		}
		lastanswer = String.valueOf(answer);
		return lastanswer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.print(T.solution(word));	
	}
}
