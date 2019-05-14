package main.search;

import edu.princeton.cs.algs4.*;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 索引以及反向索引的查找
 * @date 2019/5/14 9:34
 */
public class LookupIndex {

    public static void main(String[] args) {
        // 索引数据库
        In in = new In(args[0]);
        // 分隔符
        String sp = args[1];
        ST<String, Queue<String>> st = new ST<>();
        ST<String, Queue<String>> ts = new ST<>();

        while (in.hasNextLine()) {
            String[] a = in.readLine().split(sp);
            String key = a[0];
            for (int i = 1; i < a.length; i++) {
                String val = a[i];
                if (!st.contains(key))
                    st.put(key, new Queue<String>());
                if (!ts.contains(val))
                    ts.put(val, new Queue<String>());
                st.get(key).enqueue(val);
                ts.get(val).enqueue(key);
            }
        }

        while (!StdIn.isEmpty()) {
            String query = StdIn.readLine();
            if (st.contains(query))
                for (String s : st.get(query))
                    StdOut.println("  " + s);
            if (ts.contains(query))
                for (String s : ts.get(query))
                    StdOut.println("  " + s);

        }
    }
}
