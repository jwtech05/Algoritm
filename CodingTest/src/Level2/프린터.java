package Level2;

	
import java.util.*;
 
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int n : priorities)
            queue.offer(n);
 
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    if(location == i) 
                        return answer;
                    answer++;
                    queue.poll();
                }
            }
        }
 
        return answer;
    }
}

