package main.graphs;

import main.fundamentals.datatype.Queue;
import main.fundamentals.datatype.Stack;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/16 11:12
 */
public class DepthFirstOrder {

    private boolean[] marked;
    // 所有顶点的前序排列
    private Queue<Integer> pre;
    // 所有顶点的后序排列
    private Queue<Integer> post;
    // 所有顶点的逆后序排列
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph G) {
        pre = new Queue<>();
        post = new Queue<>();
        reversePost = new Stack<>();

        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v])
                dfs(G, v);
        }
    }

    private void dfs(Digraph G, int v) {
        pre.enqueue(v);

        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
        post.enqueue(v);
        reversePost.push(v);
    }

    public Iterable<Integer> pre() {
        return pre;
    }

    public Iterable<Integer> post() {
        return post;
    }

    public Iterable<Integer> reversePost() {
        return reversePost;
    }
}
