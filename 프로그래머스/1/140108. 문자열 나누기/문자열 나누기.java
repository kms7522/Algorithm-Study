/*
1. 첫글자 체크
2. 첫글자와 비교해서 같으면 cnt++ 아니면 cnt--
3. cnt 0이면 while문 탈출 answer ++
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); ) {
            char c = s.charAt(i);
            int cnt = 1;
            i++;
            while(i < s.length() && cnt != 0) {
                if(s.charAt(i) == c)
                    cnt++;
                else 
                    cnt--;
                i++;
            }
            answer++;
        }
        return answer;
    }
}