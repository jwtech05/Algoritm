package ����ä��;

import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList();
        Map<String, String> map = new HashMap<>();
        int cnt = 0;
        for(String x : record){
            String a = x.substring(0,x.indexOf(" "));
            String b = x.substring(x.indexOf(" "), x.lastIndexOf(" "));
            String c = x.substring(x.lastIndexOf(" ")+1);
            if(a.equals("Enter")){
                map.put(b,c);
            }else if(a.equals("Leave")){
                map.remove(b);
            }else if(a.equals("Change")){
                map.put(b,c);
            }
        }
        for(String x : record){
            String a = x.substring(0,x.indexOf(" "));
            String b = x.substring(x.indexOf(" "), x.lastIndexOf(" "));
            if(a.equals("Enter")){
                answer.add(map.get(b)+"���� ���Խ��ϴ�.");
            }else if(a.equals("Leave")){
                b = x.substring(x.indexOf(" "));
                answer.add(map.get(b)+"���� �������ϴ�");
            }
        }
        String[] test = new String[answer.size()];
        int i = 0;
        for(String x : answer){
            test[i] = x;
            i++;
        }
        return test;
    }
}