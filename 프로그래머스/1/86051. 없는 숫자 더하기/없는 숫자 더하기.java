/*
1. 0~9까지의 배열만듦
2. numbers에 들어있는 수의 인덱스 배열 증가
3. 0인 배열 더해줌

numbers는 중복 없어서 그냥 45에서 나온 수 빼주는게 더 효율적
*/

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] cnt = new int[10];
        for(int i=0; i<numbers.length; i++) {
            cnt[numbers[i]]++;
        }
        for(int i=0; i<10; i++) {
            if(cnt[i] == 0)
                answer += i;
        }
        return answer;
    }
}