package 정렬.중복확인;

import java.util.*;

public class Main {
	public String solution(int n, int[] arr) {
		String answer ="U";
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		System.out.print(T.solution(n, arr));
	}
}
