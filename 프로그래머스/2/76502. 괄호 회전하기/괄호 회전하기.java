import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i) + s.substring(0,i);
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int j=0; j<s.length(); j++) {
                char c = str.charAt(j);
                if(c == '[' || c == '(' || c =='{') {
                    stack.push(c);
                }
                else {
                    if(stack.isEmpty()) {
                        check = false;
                        break;
                    }
                    else if((c == ']' && stack.peek() == '[') ||
                           (c == ')' && stack.peek() == '(') ||
                           (c == '}' && stack.peek() == '{')) {
                        stack.pop();
                    }
                }
            }
            if(check && stack.isEmpty())
                answer++;
        }
        return answer;
    }
}