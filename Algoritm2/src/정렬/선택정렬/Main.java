package 정렬.선택정렬;

import java.util.*;

public class Main {
	static int[] arr;
	public int[] solution(int n) {
		for(int i=0; i<n-1; i++) {
			int tmp = arr[i];
			for(int j=i+1; j<n; j++) {
				if(arr[j] < tmp) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int x :T.solution(n)) {
			System.out.print(x+" ");
		}
	}
}
