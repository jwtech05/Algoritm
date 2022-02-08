package 배열.가위바위보;

import java.util.Scanner;

public class Main {
	public char[] solution(int n, int[] a, int[] b) {
		char[] answer = new char[n];
		for(int i=0; i<n; i++) {
			if(a[i] == b[i]) answer[i] = 'D';
			else if((a[i] == 1 && b[i] == 3)) answer[i]= 'A';
			else if((a[i] ==2 && b[i] == 1)) answer[i]= 'B';
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) a[i]= scan.nextInt();
		for(int i=0; i<n; i++) b[i]= scan.nextInt();
		for(char x: T.solution(n, a, b)) {
			System.out.println(x);
		}
	}
}
