import java.util.*;

/*
원형 수열 배열 크기로 % 연산하여 구현
각각 합 구한다음에 해시로 중복 없앰
*/
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++) {
            int sum = 0;
            for(int j=0; j<elements.length; j++) {
                sum += elements[(i+j) % elements.length];
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}