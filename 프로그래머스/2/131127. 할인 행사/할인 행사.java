
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> target = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> count = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                String item = discount[j];
                count.put(item, count.getOrDefault(item, 0) + 1);
            }

            boolean possible = true;

            for (String item : want) {
                if (count.getOrDefault(item, 0) < target.get(item)) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer++;
            }
        }

        return answer;
    }
}
