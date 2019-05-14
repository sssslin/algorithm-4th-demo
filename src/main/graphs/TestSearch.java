package main.graphs;

import edu.princeton.cs.algs4.In;


/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 图处理用例
 * @date 2019/5/14 15:07
 */
public class TestSearch {

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        // TODO: 2019/5/14 search类不知道从哪来
//        Search search = new Search(G, s);
//
//        for (int v = 0; v < G.V(); v++)
//            if (search.marked(v))
//                StdOut.print(v + " ");
//        StdOut.println();
//
//        if (search.count() != G.V())
//            StdOut.print("NOT ");
//        StdOut.println("connected");
    }
}
