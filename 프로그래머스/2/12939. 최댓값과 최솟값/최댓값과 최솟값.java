import java.util.*;

/*
1. 문자열 " "로 스플릿
2. parseInt로 정수로 바꾼뒤 정수 배열에 추가
3. 정수 배열 sort후 첫번째 인덱스와 마지막 인덱스 리턴
*/

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i=0; i<str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length - 1];
        return answer;
    }
}