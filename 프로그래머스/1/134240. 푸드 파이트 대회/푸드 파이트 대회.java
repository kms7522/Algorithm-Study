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