package main.graphs;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 任意顶点对之间的最短路径
 * @date 2019/5/20 10:38
 */
public class DijkstraAllPairsSP {

    private DijkstraSP[] all;

    DijkstraAllPairsSP(EdgeWeightedGraph G) {
        all = new DijkstraSP[G.V()];
        for (int v = 0; v < G.V(); v++) {
            all[v] = new DijkstraSP(G, v);
        }
    }

    Iterable<Edge> path(int s, int t) {
        return all[s].pathTo(t);
    }

    double dist(int s, int t) {
        return  all[s].distTo(t);
    }
}
