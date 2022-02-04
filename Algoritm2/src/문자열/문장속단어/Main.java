package 문자열.문장속단어;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer="";
		ArrayList<Character> tmp = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)))
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		T.solution(str);
	}
}
