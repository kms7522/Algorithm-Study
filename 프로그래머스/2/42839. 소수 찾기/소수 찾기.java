import java.util.*;

/*
완전탐색 순열 + 에라토스테네스의 체
1. numbers 크기만큼 permute for문 돌림
2. permute 내부에서 0에서 i 될떄까지 재귀돌림
3. 재귀 돌릴때 char 하나씩 넣으면서 depth 1 늘림
4. 재귀 끝나면 visited false 로 되돌림
5. 해시세트에 넣고 다 소수체크
*/
class Solution {
    static HashSet<Integer> set = new HashSet<>();
    static boolean[] visited;
    static char[] arr;
    public int solution(String numbers) {
        int answer = 0;
        int n = numbers.length();
        arr = numbers.toCharArray();
        visited = new boolean[n];
        for(int i=1; i<=n; i++) {
            permute("", 0, i);
        }
        
        for(int num : set) {
            System.out.println(num);
            if(isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    static void permute(String str, int depth, int r) {
        if(depth == r) {
            set.add(Integer.parseInt(str));
            return;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                permute(str + arr[i], depth + 1, r);
                visited[i] = false;
            }
        }
    }
    static boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}