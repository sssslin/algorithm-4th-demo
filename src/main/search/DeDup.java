package main.search;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.HashSet;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/13 9:21
 */
public class DeDup {

    public static void main(String[] args) {
        HashSet<String> set;
        set = new HashSet<>();
        while (!StdIn.isEmpty()) {

            String key = StdIn.readString();
            if (!set.contains(key)) {
                set.add(key);
                StdOut.println(key);
            }
        }
    }
}
