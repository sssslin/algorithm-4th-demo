package main.graphs;

import main.fundamentals.datatype.Stack;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 使用深度优先搜索查找图中的路径
 * @date 2019/5/14 15:52
 */
public class DepthFirstPaths {

    // 这个顶点上调用过dfs了吗?
    private boolean[] marked;
    // 从起点到一格顶点的已知路径上的最后一个顶点
    private int[] edgeTo;
    // 起点
    private final int s;

    public DepthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
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
