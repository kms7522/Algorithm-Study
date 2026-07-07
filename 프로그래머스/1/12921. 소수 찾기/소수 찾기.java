class Solution {
    public int solution(int n) {
        boolean[] check = new boolean[n + 1];
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(!check[i]){
                for(int j=i * i; j<=n; j += i) {
                    if(j%i == 0)
                        check[j] = true;
                }
            }
        }
        int answer = 0;
        for(int i=2; i<=n; i++) {
            if(!check[i])
                answer++;
        }
        return answer;
    }
}