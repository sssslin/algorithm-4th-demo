package main.graphs;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.UF;

import java.util.Comparator;


/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 最小生成树的kruskal算法
 * @date 2019/5/17 11:05
 */
public class KruskalMST {

    private Queue<Edge> mst;

    public KruskalMST(EdgeWeightedGraph G) {
        mst = new Queue<>();
        MinPQ<Edge> pq = new MinPQ<Edge>((Comparator<Edge>) G.edges());

        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            // 从pq得到权重最小的边和它的顶点
            Edge e = pq.delMin();
            int v = e.either(), w = e.other(v);
            // 忽略失效的边
            if (uf.connected(v, w)) continue;

            // 合并分量
            uf.union(v,w);
            // 将边添加到最小生成树中
            mst.enqueue(e);
        }
    }

    public Iterable<Edge> edges () {
        return mst;
    }

    public double weight() {
        return 0.0;
    }
}
