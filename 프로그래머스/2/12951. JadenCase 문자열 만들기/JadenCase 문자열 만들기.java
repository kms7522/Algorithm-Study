/*
1. 한글자씩 나눈 String 배열로 저장
2. 공백이면 sb 넣고 true 바꾸고 패스
3. 첫번째 글자면 대문자로 넣음
4. 아니면 소문자로 넣음

public String solution(String s) {
    String answer = "";
    String[] sp = s.toLowerCase().split("");
    boolean flag = true;

    for(String ss : sp) {
        answer += flag ? ss.toUpperCase() : ss;
        flag = ss.equals(" ") ? true : false;
    }

    return answer;
}
  처음 넣을때 소문자로 만들고 삼항연산자도 이용하면 더 깔끔하게 쓸수 있음
*/

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        
        for(String str : arr) {
            if(str.equals(" ")) {
                sb.append(str);
                check = true;
                continue;
            }
            if(check) {
                sb.append(str.toUpperCase());
                check = false;
            }
            else {
                sb.append(str.toLowerCase());
            }
        }
        
        return sb.toString();
    }
}