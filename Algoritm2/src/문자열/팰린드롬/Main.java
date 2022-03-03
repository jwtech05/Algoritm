package 문자열.팰린드롬;

import java.util.*;

public class Main {
	public String solution(String str) {
		String answer = "NO";
		int lt =0, rt= str.length()-1;
		str = str.toUpperCase();
		String str1 = str.replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str1).reverse().toString();
		if(str1.equals(tmp)) answer = "YES";
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(T.solution(str));
	}
}
