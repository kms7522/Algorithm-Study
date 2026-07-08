/*
1. 문자열 스택에 넣음
2. 스택 비지않고 들어있는 문자 같으면 pop 아니면 push
3. for문 다돌린후 스택 비어있으면 참
*/

import java.util.*; 

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()) {
            answer = 1;
        }
        return answer;
    }
}