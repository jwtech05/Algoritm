package kakao1;

import java.util.Scanner;

public class Main2 {
	   static int[] graph;
	   public String solution(int n, int k, String[] cmd) {
	        String answer = "";
	        graph = new int[n];
	        String loc ="";
	        String loc2 ="";
	        int tmp = k;
	        int num = 0;
	        for(int i=0; i<n; i++) graph[i] = i;
	        for(String x : cmd){
	            loc = x.substring(0,1);
	            if(loc.equals("D") || loc.equals("U")) {
	            	loc2 = x.substring(1);
		            num = Integer.valueOf(loc2);
		            if(loc.equals("D")) {
		            	tmp += num;
		            }else {
		            	tmp -= num;
		            }
	            }else if(loc.equals("C")){
	            	for(int i=tmp; i<n; i++) {
	            		graph[tmp] = graph[tmp+1]-1;
	            	}
	            }else {
	            	
	            }
	            
	        }
	        return answer;  
	    }
	
	public static void main(String[] args) {
		Main2 T= new Main2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		String[] cmd = new String[9];
		for(int i=0; i<9; i++) {
			cmd[i] = scan.next();
		}
		T.solution(n, k, cmd);
	}

}
