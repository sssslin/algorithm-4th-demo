package main.graphs;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.IndexMinPQ;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 最小生成树的Prim算法(即时版本)
 * @date 2019/5/17 10:44
 */
public class PrimMST {

    // 距离树最近的边
    private Edge[] edgeTo;
    // distTo[w] = edgeTo[w]. weight()
    private double[] distTo;
    // 如果v在树中则为true
    private boolean[] marked;
    // 有效的横切边
    private IndexMinPQ<Double> pq;


    public PrimMST(EdgeWeightedGraph G) {
        edgeTo = new Edge[G.V()];
        distTo = new double[G.V()];
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        pq = new IndexMinPQ<>(G.V());

        distTo[0] = 0.0;
        // 用顶点0和权重0初始化pq
        pq.insert(0, 0.0);
        while (!pq.isEmpty())
            // 将最近的顶点添加到树中
            visit(G, pq.delMin());
    }

    private void visit(EdgeWeightedGraph G, int v) {
        // 将顶点添加到树中,更新数据
        marked[v] = true;
//        for (Edge e : G.adj(v)) {
//            int w = e.other(v);
//            // v-w失效
//            if (marked[w]) continue;
//            if (e.weight() < distTo[w]) {
//                // 连接w和树的最佳边Edge变为e
//                edgeTo[w] = e;
//                distTo[w] = e.weight();
//                if (pq.contains(w)) pq.change(w, distTo[w]);
//                else pq.insert(w, distTo[w]);
//            }
//        }
    }

    // TODO: 2019/5/17 Iterable和weight方法见练习4.3.31
}
