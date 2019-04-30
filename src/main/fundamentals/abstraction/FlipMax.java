package main.fundamentals.abstraction;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 创建对象并返回引用
 * @date 2019/4/23 13:49
 */
public class FlipMax {

    public static Counter max(Counter x, Counter y) {
        if (x.tally() > y.tally()) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int T = Integer.parseInt("1000000");
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            }
            else {
                tails.increment();
            }
        }

        if (heads.tally() == tails.tally()) {
            StdOut.println("Tie");
        } else {
            StdOut.println(max(heads, tails) + " wins");
        }
    }
}
