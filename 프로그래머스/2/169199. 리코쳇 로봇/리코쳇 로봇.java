import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = 0;
        int n = board.length;
        int m = board[0].length();
        boolean[][] visited = new boolean[n][m];
        int[][] maps = new int[n][m];
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<board[i].length(); j++) {
                if(board[i].charAt(j) == 'R') {
                    q.offer(new int[] {i,j});
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            for(int i=0; i<4; i++) {
                int nx = x;
                int ny = y;
                while(nx+dx[i]>=0 && nx+dx[i] < n && ny+dy[i]>=0 && ny+dy[i] <m && board[nx+dx[i]].charAt(ny+dy[i]) != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                }
                if(visited[nx][ny])
                    continue;
                maps[nx][ny] = maps[x][y] + 1;
                visited[nx][ny] = true;
                q.offer(new int[] {nx, ny});
                if(board[nx].charAt(ny) == 'G')
                    return maps[nx][ny];
            }
        }
        return -1;
    }
}