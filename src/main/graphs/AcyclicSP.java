package main.graphs;

import edu.princeton.cs.algs4.EdgeWeightedGraph;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description  无环加权有向图的最短路径算法
 * @date 2019/5/20 10:49
 */
public class AcyclicSP {

    private DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedGraph G, int s) {
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];

        for (int v = 0; v < G.V(); v++)
            distTo[v] = Double.POSITIVE_INFINITY;
        distTo[s] = 0.0;
//        Topological top = new Topological(G);
//        for (int v : top.order())
//            relax(G, v);
    }

    private void relax(EdgeWeightedDigraph G, int v) {
        // 请见4.4.15框注"顶点的松弛"
    }

    public double distTo(int v) {
        // 最短路径树实现中的标准查询算法(请见4.4.16框注
        // "最短路径API的查询方法"
        return 0.0;
    }

    public boolean hasPathTo(int v) {
        return true;
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        return null;
    }
}
