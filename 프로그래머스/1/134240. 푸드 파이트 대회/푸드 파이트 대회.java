/*
String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
StringBuilder 사용해서 위처럼하는게 더 좋으듯
*/

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i < food.length; i++) {
            sb.insert(sb.length()/2, String.valueOf(i).repeat(food[i]/2*2));
        }
        sb.insert(sb.length()/2, "0");
        return sb.toString();
    }
}