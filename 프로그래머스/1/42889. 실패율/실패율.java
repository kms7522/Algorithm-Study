import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        Map<Integer, Double> map = new HashMap<>();
        int j = 0;
        for(int i=1; i<=N; i++) {
            int cnt = 0;
            int num = stages.length - j;
            if(num == 0) {
                map.put(i, 0.0);
                continue;
            }
            for(; j<stages.length; j++) {
                if(stages[j] > i) {
                    break;
                }
                cnt++;
            }
            map.put(i, (double) cnt / num);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((a, b) -> {
            int cmp = Double.compare(map.get(b), map.get(a));

            if (cmp == 0) {
                return Integer.compare(a, b);
            }

            return cmp;
        });
        
        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}