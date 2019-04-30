package main.fundamentals.basic;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 格式化输出
 * @date 2019/4/23 11:13
 */
public class RandomSeq {
    public static void main(String[] args) {
        // 打印N个(lo, hi)之间的水井值
        int N = Integer.parseInt("5");
        double lo = Double.parseDouble("100.0");
        double hi = Double.parseDouble("200.0");

        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
