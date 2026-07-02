/*
각각 약수 구해서 limit와 비교해서 더해줌
    int[] count = new int[number + 1];    
    for (int i = 1; i <= number; i++) {
        for (int j = 1; j <= number / i; j++) {
            count[i * j]++;
        }
    }
    약수 이렇게 구하면 nlogn 시간복잡도 
    각각 number까지 i의 배수에 다 1 더해줘서 약수 구해줌
*/
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            int cnt = 0;
            for(int j=1; j<=i; j++) {
                if(i%j==0)
                    cnt++;
            }
            if(cnt > limit)
                cnt = power;
            answer += cnt;
        }
        return answer;
    }
}