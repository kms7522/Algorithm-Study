class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        for(int i=0; i<section.length; i++) {
            paint[section[i] - 1] = true;
        }
        for(int i=0; i<n; i++) {
            if(paint[i]) {
                i+=m-1;
                answer++;
            }
        }
        return answer;
    }
}