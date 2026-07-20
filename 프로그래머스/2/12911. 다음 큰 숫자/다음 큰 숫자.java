/*
Integer.bitCount(n) : n의 2진수 1의 개수
1씩 더해가면서 확인
*/

class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);
        int answer;
        for(int i=n+1;; i++) {
            if(Integer.bitCount(i) == cnt){
                answer = i;
                break;
            }
        }
        return answer;
    }
}