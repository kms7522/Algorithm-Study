import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("\\},\\{");

        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i].replace("{", "").replace("}", "");
        }
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        
        Set<Integer> hs = new HashSet<>();
        
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            String[] str = arr[i].split(",");
            for(int j=0; j<str.length; j++) {
                int num = Integer.parseInt(str[j]);
                if(!hs.contains(num)) {
                    hs.add(num);
                    answer[i] = num;
                    break;
                }
            }
        }
        
        return answer;
    }
}