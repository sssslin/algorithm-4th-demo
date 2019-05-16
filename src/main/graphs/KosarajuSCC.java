package main.graphs;

import edu.princeton.cs.algs4.DepthFirstOrder;
import edu.princeton.cs.algs4.Digraph;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 计算强连通分量的Kosaraju算法
 * @date 2019/5/16 11:58
 */
public class KosarajuSCC {

    // 已访问过的顶点
    private boolean[] marked;
    // 强连通分量的标识符
    private int[] id;
    // 强连通分量的数量
    private int count;

    public KosarajuSCC(Digraph G) {

        marked = new boolean[G.V()];
        id = new  int[G.V()];
        DepthFirstOrder order = new DepthFirstOrder(G.reverse());

        for (int s : order.reversePost())
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
    }

    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }
}
