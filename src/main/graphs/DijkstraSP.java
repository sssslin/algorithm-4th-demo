package main.graphs;

import edu.princeton.cs.algs4.IndexMinPQ;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 最短路径的dijkstraSP
 * @date 2019/5/20 10:19
 */
public class DijkstraSP {

    private DirectedEdge[] edgeTo;
    private double[] distTo;
    private IndexMinPQ<Double> pq;

    public DijkstraSP(EdgeWeightedGraph G, int s) {
        edgeTo = new DirectedEdge[G.V()];
        distTo = new double[G.V()];
        pq = new IndexMinPQ<Double>(G.V());

        for (int v = 0; v < G.V(); v++)
            distTo[v] = Double.POSITIVE_INFINITY;
        distTo[0] = 0.0;
        pq.insert(s, 0.0);
        while (!pq.isEmpty())
            relax(G, pq.delMin());
    }

    private void relax(EdgeWeightedGraph G, int v) {
//        for (DirectedEdge e : G.adj(v)) {
//            int w = e.to();
//            if (distTo[w] > distTo[v] + e.weight()) {
//                distTo[w] = distTo[v] + e.weight();
//                edgeTo[w] = e;
//                if (pq.contains(w)) pq.changeKey(w, distTo[w]);
//                else                pq.insert(w, distTo[w]);
//            }
//        }
   }

   public double distTo(int v) {
        // 最短路径树实现中的标准查询算法
        return 0.0;
   }

   public boolean hashPathTo(int v) {
        // 请见4.4.26节框注 最短路径
        return true;
   }

   public Iterable<Edge> pathTo (int v) {
        // API中的查询方法
       return null;
   }
}
