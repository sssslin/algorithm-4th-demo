package main.graphs;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/14 15:45
 */
public class PathsTest {

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        /*Paths search = new Paths(G, s);

        for (int v = 0; v < G.V(); v++)
            StdOut.print(s + " to " + ": ");
            if (search.hasPathTo(v))
                for (int x : search.pathTo(v))
                    if (x == s) StdOut.print(x);
                    else StdOut.print("-" + x);
                    */
        StdOut.println();
    }
}
