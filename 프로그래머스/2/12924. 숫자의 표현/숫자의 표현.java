/*
투포인터 문제
1. start, end 1로 시작
2. 합 구해가면서 
    i) 합 같을시 answer ++ 후 start 증가
    ii) 합 작을시 end 증가
    ii) 합 클시 start 증가
3. 이후 answer 리턴
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1, end = 1;
        int sum = 1;
        while (start <= n) {
            if (sum == n) {
                answer++;
                sum -= start;
                start++;
            } else if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }
        return answer;
    }
}