package main.fundamentals.abstraction;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 模拟掷骰子
 * @date 2019/4/23 14:05
 */
public class Rolls {

    public static void main(String[] args) {
        int T = Integer.parseInt("1000000");
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 0; i <= SIDES ; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }

        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
