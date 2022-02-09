package 정렬.버블정렬;

import java.util.*;

public class Main {
	public int[] solution(int[] arr, int n) {
		for(int j=0; j<n-1; j++) {
			for(int i=0; i<n-j-1; i++) {
				int tmp = 0;
				if(arr[i] > arr[i+1]) {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		for(int x: T.solution(arr, n)) {
			System.out.print(x+" ");
		}
	}
}
