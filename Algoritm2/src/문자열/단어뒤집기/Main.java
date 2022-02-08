package 문자열.단어뒤집기;

import java.util.*;

public class Main {
	public ArrayList<String> solution(int n, String[] arr) {
		ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			String ch = "";
			for(int j=0; j<arr[i].length(); j++) {
				ch += arr[i].charAt(arr[i].length()-j-1); 
			}
			answer.add(ch);
			ch = "";
		}
		return answer;
	}
	public static void main(String[] args) {
		 Main T = new Main();
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 String[] arr = new String[n];
		 for(int i=0; i<n; i++) arr[i] = scan.next();
		 for(String x: T.solution(n, arr)){
			 System.out.println(x);
		 }
	 }
}
