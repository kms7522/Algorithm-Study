import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new int[]{i, priorities[i]});
            pq.offer(priorities[i]);
        }
        int answer = 0;
        while(true) {
            int[] cur = q.peek();
            if(cur[1] == pq.peek()) {
                q.poll();
                pq.poll();
                answer++;
                if(cur[0] == location) {
                    break;
                }
            }
            else {
                q.poll();
                q.offer(cur);
            }
        }
        return answer;
    }
}