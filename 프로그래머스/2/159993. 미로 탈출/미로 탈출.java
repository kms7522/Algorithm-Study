import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int sx = -1, sy = -1, lx = -1, ly = -1, ex = -1, ey = -1;
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[i].length(); j++) {
                if(maps[i].charAt(j) == 'S') {
                    sx = i;
                    sy = j;
                }
                else if(maps[i].charAt(j) == 'L') {
                    lx = i;
                    ly = j;
                }
                else if(maps[i].charAt(j) == 'E') {
                    ex = i;
                    ey = j;
                }
            }
        }
        int answer = 0;
        int tmp = bfs(maps, sx, sy, lx, ly);
        if(tmp == -1)
            return tmp;
        answer += tmp;
        tmp = bfs(maps, lx, ly, ex, ey);
        if(tmp == -1)
            return tmp;
        answer += tmp;
        return answer;
    }
    public int bfs(String[] maps, int sx, int sy, int ex, int ey) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{sx, sy, 0});
        visited[sx][sy] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == ex && y == ey) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx].charAt(ny) == 'X') {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return -1;
    }
}