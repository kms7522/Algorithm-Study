import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 2;
        answer[1] = 1;
        HashSet<String> set = new HashSet<>();
        String word = words[0]; 
        set.add(word);
        for(int i=1; i<words.length; i++) {
            if(set.contains(words[i])) {
                break;
            }
            if(word.charAt(word.length() - 1) != words[i].charAt(0)) {
                break;
            }
            set.add(words[i]);
            word = words[i];
            answer[0]++;
            if(answer[0] > n) {
                answer[1]++;
                answer[0] = 1;
            }
        }
        if((answer[1] - 1) * n + answer[0] - 1 == words.length) {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}