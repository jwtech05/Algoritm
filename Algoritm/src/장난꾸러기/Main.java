package 장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int n, int[] h) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = h.clone();
		Arrays.sort(h);
		for(int i=0; i<n; i++) { 
			if(h[i] != tmp[i]) answer.add(i+1); 
			} 
		return answer;
		 
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] h = new int[n];
		int[] stu = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		for (int x : T.solution(n, h))
			System.out.print(x + " ");
	}
}
