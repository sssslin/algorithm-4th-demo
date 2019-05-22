package main.graphs;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 货币兑换中的套汇
 * @date 2019/5/22 16:32
 */
public class Arbitrage {

    public static void main(String[] args) {
        int V = StdIn.readInt();
        String[] name = new String[V];
        EdgeWeightedGraph G = new EdgeWeightedGraph(V);
        for (int v = 0; v< V; v++) {
            name[v] = StdIn.readString();
            for (int w = 0; w < V; w++){
                double rate = StdIn.readDouble();
                DirectedEdge e = new DirectedEdge(v, w, -Math.log(rate));
               //  G.addEdge(e);
            }
        }

        BellmanFordSP spt = new BellmanFordSP(G, 0);
        if (spt.hasNegativeCycle()) {
            double stake = 1000.0;
//            for (DirectedEdge e : spt.hasNegativeCycle()) {
//                StdOut.printf("%10.5f %s",stake, name[e.from()]);
//                stake *= Math.exp(-e.weight());
//                StdOut.printf("= %10.5f %s\n", stake, name[e.to()]);
//            }
        }
        else StdOut.println("No arbitrage opportunity");
    }
}
