import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++) {
            if(visited[i] == true)
                continue;
            q.offer(i);
            visited[i] = true;
            while(!q.isEmpty()) {
                int cur = q.poll();
                for(int j=0; j<n; j++) {
                    if(computers[cur][j] == 1 && visited[j] == false) {
                        q.offer(j);
                        visited[j] = true;
                    }
                }
            }
            answer++;
        }
        return answer;
    }
}