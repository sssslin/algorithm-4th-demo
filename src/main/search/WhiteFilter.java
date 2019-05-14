package main.search;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description  白名单过滤器
 * @date 2019/5/13 9:33
 */
public class WhiteFilter {

    public static void main(String[] args) {
        HashSet<String> set;
        set = new HashSet<>();
        In in = new In(args[0]);

        while (!in.isEmpty()) {
            set.add(in.readString());
        }

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (set.contains(word))
                StdOut.println(word);
        }
    }
}
