package main.graphs;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 符号图的数据类型
 * @date 2019/5/15 9:59
 */
public class SymbolGraph {

    // 符号名 -> 索引
    private ST<String,Integer> st;
    // 索引 -> 符号名
    private String[] keys;
    // 图
    private Graph G;

    public SymbolGraph(String stream, String sp) {
        st = new ST<>();
        // 第一遍
        In in = new In(stream);
        // 构造索引
        while (in.hasNextLine()) {
            // 读取字符串
            String[] a = in.readLine().split(sp);
            // 为每个不同的字符串类关联一个索引
            for (int i = 0; i < a.length; i++)
                if (!st.contains(a[i]))
                    st.put(a[i], st.size());
        }

        // 用来获得顶点名的反向索引是一个数组
        keys = new String[st.size()];
        for (String name : st.keys())
            keys[st.get(name)] = name;

        G = new Graph(st.size());
        // 第二遍
        in = new In(stream);
        // 构造图
        while (in.hasNextLine()) {
            // 将每一行的顶点和该行的其他顶点相连
            String[] a = in.readLine().split(sp);
            int v = st.get(a[0]);
            for (int i = 1; i < a.length; i++) {
                // TODO: 2019/5/15 方法缺失
            }
        }
    }

    public boolean contains(String s) {
        return st.contains(s);
    }

    public int index(String s) {
        return st.get(s);
    }

    public String name(int v) {
        return keys[v];
    }

    public Graph G() {
        return G;
    }
}
