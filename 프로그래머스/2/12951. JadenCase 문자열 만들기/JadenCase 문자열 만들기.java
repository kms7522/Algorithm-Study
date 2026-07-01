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