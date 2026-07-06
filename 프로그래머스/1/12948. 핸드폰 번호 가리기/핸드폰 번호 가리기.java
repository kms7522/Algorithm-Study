/*
1. 4자리 전까지 stringbuilder에 *추가
2. substring한 4자리 추가
*/
class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length() - 4));
        return sb.toString();
    }
}