package kakao3;

import java.util.*;

class Main {
	public int[] solution(int n, int m, int k) {
		int lt = 0;
		int rt = 0;
		int[] answer = new int[2];
		if(m != k-1) {
			int a = n;
			int b = m;
			int c = k;
			while(Math.abs(a-b) != 1 && Math.abs(b-c) != 1) {
				if(a < b) {
					a = b+1;
					lt++;
				}
				else if(b < a){
					b = a+1;
					lt++;
				}
			}
		}
		if(n != m-1) {
			int a = n;
			int b = m;
			int c = k;
			while(Math.abs(a-b) != 1 || Math.abs(b-c) != 1) {
				if(b < c) {
					c = b-1;
					rt++;
				}
				else if(c < b){
					b = c-1;
					rt++;
				}
			}
		}
		if(lt > rt) {
			answer[0] = rt;
			answer[1] = lt;
		}else {
			answer[0] = lt;
			answer[1] = rt;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main K = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		for(int x: K.solution(n,m,k)) {
			System.out.print(x+" ");
		};
	}
}
