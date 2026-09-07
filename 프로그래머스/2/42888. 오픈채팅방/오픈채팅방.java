import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> hm = new HashMap<>();
        for(int i=0; i<record.length; i++) {
            String[] str = record[i].split(" ");
            if(!str[0].equals("Leave")) {
                hm.put(str[1], str[2]);
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<record.length; i++) {
            String[] str = record[i].split(" ");
            String nickname = hm.get(str[1]);
            if(str[0].equals("Enter")) {
                arr.add(nickname + "님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")) {
                arr.add(nickname + "님이 나갔습니다.");
            }
        }
        String[] answer = new String[arr.size()];
        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}