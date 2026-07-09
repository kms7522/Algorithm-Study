/*
dp 문제
n번째 줄마다 최대로 나올수 있는 경우 저장
n-1줄의 두개중 어떤거랑 더해야 최대치 나오는지 계산
마지막줄에서 최대치 뽑아냄
*/

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[500][500];
        dp[0][0] = triangle[0][0];
        for(int i=1; i<triangle.length; i++) {
            dp[i][0] = triangle[i][0] + dp[i-1][0];
            for(int j=1; j<triangle[i].length - 1; j++) {
                dp[i][j] = triangle[i][j] + 
                    Math.max(dp[i-1][j-1], dp[i-1][j]);
            }
            dp[i][triangle[i].length - 1] = triangle[i][triangle[i].length - 1] +
                dp[i-1][triangle[i-1].length - 1];
        }
        int answer = 0;
        for(int i=0; i<triangle.length; i++) {
            answer = Math.max(answer, dp[triangle.length - 1][i]);
        }
        return answer;
    }
}