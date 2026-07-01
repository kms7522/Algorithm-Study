import java.util.*;
/*
1. 해시 세트 만들어서 중복확인
2. 전단어 뒷글자와 현단어 앞글자 체크
    실패 인덱스만 찾아서 게산했으면 더 깔끔했을듯
*/
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