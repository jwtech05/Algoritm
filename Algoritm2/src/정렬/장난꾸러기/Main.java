package 정렬.장난꾸러기;

import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>(); 
		int[] tmp = new int[n+1];
		tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i=1; i<=n; i++) if(tmp[i] != arr[i]) answer.add(i);
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) arr[i] = scan.nextInt();
		for(int x: T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}
