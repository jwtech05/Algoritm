package 효율성.연속부분수열;

import java.util.Scanner;

public class Main {
	public int solution(int[] arr, int n, int m) {
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		System.out.print(T.solution(arr, n , m));
	}
}
