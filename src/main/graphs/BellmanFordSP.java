package main.graphs;

import main.fundamentals.datatype.Queue;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 基于队列的算法bellman-ford算法
 * @date 2019/5/22 15:59
 */
public class BellmanFordSP {
    // 从起点到某个顶点的路径长度
    private double[] distTo;
    // 从起点到某个顶点的最后一条边
    private DirectedEdge[] edgeTo;
    // 该顶点是否存在于队列中
    private boolean[] onQ;
    //正在被放松的顶点
    private Queue<Integer> queue;
    // relax()的调用次数
    private int cost;
    // edgeTo[]中的是否有负权重环
    private Iterable<DirectedEdge> cycle;

    public BellmanFordSP(EdgeWeightedGraph G, int s) {
        distTo = new double[G.V()];
        edgeTo = new DirectedEdge[G.V()];
        onQ = new boolean[G.V()];
        queue = new Queue<>();
        for (int v = 0; v < G.V(); v++)
            distTo[v] = Double.POSITIVE_INFINITY;
        distTo[s] = 0.0;
        queue.enqueue(s);
        onQ[s] = true;
        // this.hasNegativeCycle()不行
        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            onQ[v] = false;
            relax(G, v);
        }
    }

    private void relax(EdgeWeightedGraph G, int v) {
        // 4.4.6节注 "Bellman-ford"算法的放松操作
    }

    // TODO: 2019/5/22 待写
    public boolean hasNegativeCycle() {
        return true;
    }
}
