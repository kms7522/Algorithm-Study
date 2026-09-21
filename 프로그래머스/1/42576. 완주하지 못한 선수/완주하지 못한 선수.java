import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String key : participant) {
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        for(String key : completion) {
            hm.put(key, hm.getOrDefault(key, 0) - 1);
        }
        for(String key : hm.keySet()) {
        	if(hm.get(key) != 0) {
        		answer = key;
        		return answer;
        	}
        }
        return answer;
    }
}
