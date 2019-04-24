package main.fundamentals;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 累加器test
 * @date 2019/4/24 10:42
 */
public class TestAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt("100000");

        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }

        StdOut.println(a);
    }
}
