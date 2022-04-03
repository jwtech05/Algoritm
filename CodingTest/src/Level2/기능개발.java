package Level2;

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<progresses.length; i++){
            queue.offer((int) Math.ceil((100.0- progresses[i])/speeds[i]));
        }
        while(!queue.isEmpty()){
            int day = queue.poll();
            int cnt = 1;
            
            while(!queue.isEmpty() && day >= queue.peek()){
                cnt ++;
                queue.poll();
            }
            ans.add(cnt);
        }
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}