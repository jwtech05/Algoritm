package 효율성.공통원소구하기;

import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int lt=0, rt=0;
		while(lt < n && rt < m) {
			if(a[lt] == b[rt]) {
				answer.add(a[lt++]);
				rt++;
			}else if(a[lt] < b[rt]) lt++;
			else rt++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = scan.nextInt();
		int m = scan.nextInt();
		int[] b = new int[n];
		for(int i=0; i<n; i++) b[i] = scan.nextInt();
		for(int x: T.solution(n,m,a,b)) {
			System.out.print(x+" ");
		}
	}
}
