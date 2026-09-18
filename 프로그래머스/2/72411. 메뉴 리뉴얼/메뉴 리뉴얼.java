import java.util.*;

class Solution {
    Map<String, Integer> map = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();

        for (String order : orders) {
            char[] arr = order.toCharArray();
            Arrays.sort(arr);

            for (int c : course) {
                if (arr.length >= c) {
                    comb(arr, 0, "", c);
                }
            }
        }

        for (int c : course) {
            int max = 0;

            for (String key : map.keySet()) {
                if (key.length() == c) {
                    max = Math.max(max, map.get(key));
                }
            }

            if (max < 2) {
                continue;
            }

            for (String key : map.keySet()) {
                if (key.length() == c && map.get(key) == max) {
                    answer.add(key);
                }
            }
        }

        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }

    void comb(char[] arr, int start, String cur, int target) {
        if (cur.length() == target) {
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            comb(arr, i + 1, cur + arr[i], target);
        }
    }
}