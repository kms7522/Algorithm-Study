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