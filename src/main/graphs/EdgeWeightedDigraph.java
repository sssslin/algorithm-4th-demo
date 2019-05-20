package main.graphs;

import edu.princeton.cs.algs4.In;
import main.fundamentals.datatype.Bag;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 加权有向图的数据类型
 * @date 2019/5/20 9:21
 */
public class EdgeWeightedDigraph {

    // 顶点总数
    private  int V;
    // 边的总数
    private int E;
    // 邻接表
    private Bag<DirectedEdge>[] adj;

    public EdgeWeightedDigraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<DirectedEdge>();
        }
    }

    public EdgeWeightedDigraph(In in) {
        // TODO: 2019/5/20 请见练习4.4.2
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge e) {
        adj[e.from()].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v) {
        //return adj[v];
        return null;
    }

    public Iterable<DirectedEdge> edges() {
        Bag<DirectedEdge> bag = new Bag<>();
        for (int v = 0; v <V; v++)
            for (DirectedEdge e : adj[v])
                bag.add(e);
            return bag;
    }


}
