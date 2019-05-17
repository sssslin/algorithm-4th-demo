package main.graphs;

import edu.princeton.cs.algs4.In;
import main.fundamentals.datatype.Bag;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 加权无向图的数据类型
 * @date 2019/5/17 9:38
 */
public class EdgeWeightedGraph {

    // 顶点总数
    private  int V;
    // 边的总数
    private int E;
    // 邻接表
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph (int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    public EdgeWeightedGraph(In in) {
        // TODO: 2019/5/17 见练习4.3.9
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }
    
    public Iterable<Edge> edges() {
        // TODO: 2019/5/17 请见4.3.2节注 返回加权无向图中的所有边
        return null;
    }
}
