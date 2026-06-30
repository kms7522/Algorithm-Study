/*
각각 모든 피보나치 수를 구한뒤 1234567로 나눔
굳이 다 저장안하고 i-1과 i-2정도만 각각 계속 구해서 저장하는게 더 효율적으로 보임
*/

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fib = new int[100001];
        fib[1] = 1;
        for(int i=2; i<=n; i++) {
            fib[i] = (fib[i-1] + fib[i-2]) % 1234567;
        }
        answer = fib[n];
        return answer;
    }
}