class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        int index = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                sb.append(str[i]);
                index = 0;
                continue;
            }
            if(index%2==0) {
                sb.append(str[i].toUpperCase());
            }
            else {
                sb.append(str[i].toLowerCase());
            }
            index++;
        }
        return sb.toString();
    }
}