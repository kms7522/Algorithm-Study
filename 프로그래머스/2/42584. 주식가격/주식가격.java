import java.util.*;
/*
1. for문 돌려서 인덱스를 스택에 푸시
2, 다음 가격과 비교해 더 크면 패스
3. 작으면 answer 배열의 그 인덱스 자리에 현재 i - 인덱스 추가
4. for문 끝나면 스택에 남은거 length-1 - 인덱스 answer 배열에 추가
*/
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index; 
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - 1 - index; 
        }
        
        return answer;
    }
}