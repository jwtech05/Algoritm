package 문자열.문장속단어;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer= "";
		String str1= "";
		while(str.indexOf(" ")!= -1) {
			str1 = str.substring(0, str.indexOf(" "));
			if(answer.length() < str1.length()) {
				answer = str1;
			}
			str = str.substring(str.indexOf(" ")+1);
		}
		if(str.length()> answer.length()) answer= str;
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print(T.solution(str));
	}
}
