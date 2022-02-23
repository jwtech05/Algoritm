package 해쉬.K번째큰수;

import java.util.*;

public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = -1 ;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int m=j+1; m<n; m++) {
					Tset.add(arr[i]+arr[j]+arr[m]);
				}
			}
		}
		int cnt=0;
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]= scan.nextInt();
		System.out.print(T.solution(n, k, arr));
	}
}
