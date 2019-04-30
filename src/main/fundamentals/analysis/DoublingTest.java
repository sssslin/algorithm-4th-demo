package main.fundamentals.analysis;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import main.fundamentals.analysis.Stopwatch;
import main.fundamentals.analysis.ThreeSum;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/28 14:24
 */
public class DoublingTest {

    public static double timeTrial(int N) {
        // 为处理N个随机数的6位整数的ThreeSum.count()计时
        int MAX = 1000000;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        // 打印运行时间的表格
        for (int N = 250; true; N += N) {
            // 打印问题规模为N时程序的用时
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }
}
