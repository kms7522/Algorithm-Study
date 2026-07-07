/*
long으로 바꿔서 그대로 계산
*/

class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(answer < 500 && n != 1) {
            if(n%2==0) {
                n /= 2;
            }
            else {
                n *= 3;
                n++;
            }
            answer++;
        }
        if(answer == 500)
            answer = -1;
        return answer;
    }
}