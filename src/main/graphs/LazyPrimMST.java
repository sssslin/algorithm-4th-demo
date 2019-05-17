package main.graphs;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.MinPQ;
import main.fundamentals.datatype.Queue;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 最小生成树的Prim算法的延时实现
 * @date 2019/5/17 10:04
 */
public class LazyPrimMST {

    //最小生成树的顶点
    private boolean[] marked;
    // 最小生成树的边
    private Queue<Edge> mst;
    // 横切边(包括失效的边)
    private MinPQ<Edge> pq;

    public LazyPrimMST(EdgeWeightedGraph G) {
        pq = new MinPQ<>();
        marked = new boolean[G.V()];
        mst = new Queue<>();

        // TODO: 2019/5/17 假设G是连通的(请见练习4.3.22)
        visit(G, 0);

        while (!pq.isEmpty()) {
            // 从pq中得到权重最小的边
            Edge e = pq.delMin();

            // 跳过失效的边
            int v = e.either(), w = e.other(v);
            if (marked[v] && marked[w]) continue;
            // 将边添加到树中
            mst.enqueue(e);
            // 将顶点(v或w)添加到树中
            if (!marked[v]) visit(G, v);
            if (!marked[w]) visit(G, w);
        }

    }

    private void visit(EdgeWeightedGraph G, int v) {

        // 标记顶点v并将所有连接v和未被标记顶点的边加入pq
        marked[v] = true;
//        for (Edge e : G.adj(v)) {
//            if (!marked[e.other(v)]) pq.insert(e);
//        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

    public double weight() {
        return 0.0;
    }
}
