package main.graphs;

import main.fundamentals.datatype.Queue;
import main.fundamentals.datatype.Stack;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 使用广度优先搜索查找图中的路径
 * @date 2019/5/14 16:13
 */
public class BreadthFirstPaths {

    // 到达该顶点的最短路径已知吗?
    private boolean[] marked;
    // 到达该顶点的已知路径上的最后一个顶点
    private int[] edgeTo;
    // 起点
    private final int s;

    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<>();
        // 标记起点
        marked[s] = true;
        // 将它加入队列
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            // 从队列中删去下一个顶点
            int v = queue.dequeue();
            for (int w : G.adj(v))
                // 对于每个未被标记的相邻顶点
                if (!marked[w]) {
                    // 保存最短路径的最后一条边
                    edgeTo[w] = v;
                    // 标记它,因为最短路径已知
                    marked[w] = true;
                    // 并将它添加到队列中
                    queue.enqueue(w);
                }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}
