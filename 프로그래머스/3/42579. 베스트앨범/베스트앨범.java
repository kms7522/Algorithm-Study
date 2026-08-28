import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlay = new HashMap<>();
        Map<String, List<int[]>> listByGenre = new HashMap<>();
        
        for(int i=0; i<genres.length; i++) {
            totalPlay.put(genres[i], totalPlay.getOrDefault(genres[i], 0) + plays[i]);
            listByGenre.putIfAbsent(genres[i], new ArrayList<>());
            listByGenre.get(genres[i]).add(new int[]{i, plays[i]});
        }
        
        List<String> genreList = new ArrayList<>(totalPlay.keySet());

        genreList.sort((a, b) ->
                totalPlay.get(b) - totalPlay.get(a)
        );

        List<Integer> result = new ArrayList<>();

        for (String genre : genreList) {
            List<int[]> songs = listByGenre.get(genre);

            songs.sort((a, b) -> {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }

                return b[1] - a[1];
            });

            result.add(songs.get(0)[0]);

            if (songs.size() >= 2) {
                result.add(songs.get(1)[0]);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}