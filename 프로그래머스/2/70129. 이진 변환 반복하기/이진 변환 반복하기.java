/*
1. 0빼기전과 후의 크기 비교해서 더해줌
2. 0뺀후의 크기 2진법으로 변환
3. 1될떄까지 반복
*/
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            int len = s.length();
            s = s.replaceAll("0", "");
            answer[1] += len - s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}