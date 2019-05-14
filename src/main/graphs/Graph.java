package main.graphs;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/14 9:20
 */
public class Graph {

    // 顶点数目
    private final int V;
    // 边的数目
    private int E;
    // 邻接表
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        // 创建邻接表
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public Graph(In in) {
        // 读取V并将图初始化
        this(in.readInt());
        // 读取E
        int E = in.readInt();
        for (int i = 0; i < E; i++) {
            // 添加一条边,并读取两个顶点
            int v = in.readInt();
            int w = in.readInt();
            // 添加一条连接他们的边
            addEdge(v, w);
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    private void addEdge(int v, int w) {
        // 将w添加到v的链表中
        adj[v].add(w);
        // 将v添加到w的链表中
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
