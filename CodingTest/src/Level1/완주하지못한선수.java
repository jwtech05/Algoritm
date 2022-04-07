package Level1;

public class 완주하지못한선수 {
	import java.util.*;
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        int j = 0;
	        Map<String, Integer> map = new HashMap<>();
	        for(int i=0; i<participant.length; i++){
	            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);    
	        }
	        for(int i=0; i<completion.length; i++){
	            map.put(completion[i], map.getOrDefault(completion[i], 0)-1);
	        }
	        for(String x: map.keySet()){
	            if(map.get(x)==1) answer = x;
	        }
	        return answer;
	    }
	}
}
