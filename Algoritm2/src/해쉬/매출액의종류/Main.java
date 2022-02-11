package 해쉬.매출액의종류;

import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int n, int k, int[] days) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();
		int kind = 0;
		for(int i=0; i<k; i++) {
			HM.put(days[i], HM.getOrDefault(days[i], 0)+1);
			kind = HM.size();
		}
		answer.add(kind);
		for(int i=k; i<n; i++) {
			HM.put(days[i-k], HM.getOrDefault(days[i-k], 0)-1);
			if(HM.get(days[i-k]) == 0) HM.remove(days[i-k]);
			HM.put(days[i], HM.getOrDefault(days[i], 0)+1);
			kind = HM.size();
			answer.add(kind);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] days = new int[n];
		for(int i=0; i<n; i++) days[i] = scan.nextInt();
		for(int x :T.solution(n, k, days)) {
			System.out.print(x+" ");
		};
	}
}
