package 이분검색;

import java.util.*;

public class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt=0, rt=n-1;
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m) rt = mid-1;
			else lt = mid+1;
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
		System.out.print(T.solution(n, m, arr));
	}
}
