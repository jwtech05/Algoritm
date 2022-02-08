package 동적.계단오르기;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 0;
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 2;
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-1]+ arr[i-2];
		}
		answer = arr[n-1];
		System.out.print(answer);
	}
}
