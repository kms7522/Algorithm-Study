/*
AEIOU 각각 0,1,2,3,4
자리수마다 *5+1
*/

class Solution {
    public int solution(String word) {
        int answer = 0;
        int weight = 1; 
        String str = "AEIOU";
        
        for (int i = 4; i >= 0; i--) {
            if (i < word.length()) {
                int index = str.indexOf(word.charAt(i));
                answer += (index * weight) + 1;
            }
            weight = weight * 5 + 1;
        }
        
        return answer;
    }
}