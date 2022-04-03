package Level2;

import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long lt = 0;
        long rt = (long)n * times[times.length-1];
        while(lt <= rt){
            long mid = (lt+rt)/2;
            long ans = 0;
            for(int i=0; i<times.length; i++){
                ans += mid / times[i];
            }
            if(ans < n){
                lt = mid + 1;
            }else{
                rt = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}