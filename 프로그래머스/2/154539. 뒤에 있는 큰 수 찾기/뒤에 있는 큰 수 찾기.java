import java.util.*;
/*
스택 문제
1. 스택이 비거나 탑이 number보다 커질때까지 pop함
2. 스택이 비어있으면 -1, 아니면 스택의 탑 넣음
3. 스택에 number 푸시함
*/
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=numbers.length - 1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(numbers[i]);
        }
        return answer;
    }
}