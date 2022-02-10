package 동적.돌다리건너기;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+2];
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3; i<n+2; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.print(arr[n+1]);
	}
}
