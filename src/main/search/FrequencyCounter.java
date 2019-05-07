package main.search;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 符号表的用例
 * @date 2019/5/7 15:20
 */
public class FrequencyCounter {

    public static void main(String[] args) {
        // 最小键长
        int minlen = Integer.parseInt(args[0]);
        ST<String, Integer> st = new ST<>();

        while (!StdIn.isEmpty()) {
            // 构造符号表并统计频率
            String word = StdIn.readString();
            // 忽略较短的单词
            if (word.length() < minlen) continue;
            if (!st.contains(word))     st.put(word, 1);
            else                        st.put(word, st.get(word) + 1);
        }

        // 找出出现频率最高的单词
        String max = " ";
        st.put(max, 0);
        for (String word : st.keys())
            if (st.get(word) > st.get(max))
                max = word;
        StdOut.println(max + " "+ st.get(max));
    }
}
