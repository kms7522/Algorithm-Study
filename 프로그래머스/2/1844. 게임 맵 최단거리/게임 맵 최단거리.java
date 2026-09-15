import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                maps[nx][ny] = maps[x][y] + 1;

                q.offer(new int[]{nx, ny});
            }
        }

        if (!visited[n - 1][m - 1]) {
            return -1;
        }

        return maps[n - 1][m - 1];
    }
}