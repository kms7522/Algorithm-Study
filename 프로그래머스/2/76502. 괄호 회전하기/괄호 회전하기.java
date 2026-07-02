import java.util.*;

/*
1. 문자열 회전후 스택에 한글자씩 넣음
2. 괄호시작이면 그냥 push
3. 괄호 끝이면 스택 비었는지 체크 후 탑과 비교
회전은 이렇게 하는게 나은듯
    stringBuilder.append(stringBuilder.charAt(0));
    stringBuilder.deleteCharAt(0);
*/
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