/*
n을 만드는법 : n-1에서 + 1하는법 + n-2 에서 +2하는법
피보나치 수열과 유사함
dp[n] = dp[n-1] + dp[n-2]
피보나치 수열처럼 구하면됨
*/
class Solution {
    public long solution(int n) {
        long[] dp = new long [2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        long answer = dp[n];
        return answer;
    }
}