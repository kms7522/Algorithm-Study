import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[][] str = new String[files.length][3];
        
        for (int i = 0; i < files.length; i++) {
            int j = 0;
            str[i][0] = files[i];
            for (; j < files[i].length(); j++) {
                if (Character.isDigit(files[i].charAt(j))) {
                    break;
                }
            }

            str[i][1] = files[i].substring(0, j);

            int tmp = j;

            for (; j < files[i].length(); j++) {
                if (!Character.isDigit(files[i].charAt(j))) {
                    break;
                }
            }

            str[i][2] = files[i].substring(tmp, j);
        }

        Arrays.sort(str, (a, b) -> {
            int headCompare = a[1].compareToIgnoreCase(b[1]);

            if (headCompare != 0) {
                return headCompare;
            }

            int numA = Integer.parseInt(a[2]);
            int numB = Integer.parseInt(b[2]);

            return Integer.compare(numA, numB);
        });
        String[] answer = new String[files.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i][0];
        }
        return answer;
    }
}