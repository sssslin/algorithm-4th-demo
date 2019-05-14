package main.search;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 字典的查找
 * @date 2019/5/13 9:48
 */
public class LookupCSV {

    public static void main(String[] args) {
        In in = new In("D:\\algs4-data\\DJIA.csv");
        int keyField = Integer.parseInt("0");
        int valField = Integer.parseInt("3");
        ST<String, String> st = new ST<String, String>();
        // TODO: 2019/5/13 输出结果与书本不符
        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] tokens = line.split(",");
            String key = tokens[keyField];
            String val = tokens[valField];
            st.put(key, val);
        }

        while (!StdIn.isEmpty()) {
            String query = StdIn.readString();
            if (st.contains(query))
                StdOut.println(st.get(query));
        }
    }
}
