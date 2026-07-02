/*
1. 문자열 소문자로 바꿈
2. p면 cnt++ y면 cnt--
3. cnt 0이면 true
*/

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p')
                cnt++;
            else if (c == 'y')
                cnt--;
        }
        if(cnt != 0)
            answer = false;
        return answer;
    }
}