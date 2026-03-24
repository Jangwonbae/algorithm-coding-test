import java.util.*

class Solution {
    // 이동 방향: 우, 좌, 하, 상
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)

    fun solution(board: Array<String>): Int {
        val n = board.size
        val m = board[0].length
        var start = IntArray(2)
        
        // 1. 시작점(R) 위치 찾기
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (board[i][j] == 'R') {
                    start = intArrayOf(i, j)
                }
            }
        }

        return bfs(board, start, n, m)
    }

    fun bfs(board: Array<String>, start: IntArray, n: Int, m: Int): Int {
        val queue: Queue<Node> = LinkedList()
        val visited = Array(n) { BooleanArray(m) }

        queue.add(Node(start[0], start[1], 0))
        visited[start[0]][start[1]] = true

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            // 목표 지점(G)에 도달했는지 확인
            if (board[curr.r][curr.c] == 'G') {
                return curr.dist
            }

            // 4방향으로 미끄러지기
            for (i in 0 until 4) {
                var nr = curr.r
                var nc = curr.c

                // 범위를 벗어나지 않고 장애물(D)을 만나기 전까지 계속 이동
                while (true) {
                    val nextR = nr + dx[i]
                    val nextC = nc + dy[i]

                    if (nextR !in 0 until n || nextC !in 0 until m || board[nextR][nextC] == 'D') {
                        break
                    }
                    nr = nextR
                    nc = nextC
                }

                // 멈춘 위치가 방문하지 않았던 곳이라면 큐에 추가
                if (!visited[nr][nc]) {
                    visited[nr][nc] = true
                    queue.add(Node(nr, nc, curr.dist + 1))
                }
            }
        }

        return -1 // 목표에 도달할 수 없는 경우
    }

    data class Node(val r: Int, val c: Int, val dist: Int)
}