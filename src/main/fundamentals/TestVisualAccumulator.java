package main.fundamentals;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/24 10:54
 */
public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt("2000");

        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t <T ; t++) {
            a.addDataValue(StdRandom.random());
        }

        StdOut.println(a);
    }
}
