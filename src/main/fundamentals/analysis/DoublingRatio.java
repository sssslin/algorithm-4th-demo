package main.fundamentals.analysis;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/28 17:13
 */
public class DoublingRatio {

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
        double prev = timeTrial(125);
        for (int N = 250; true; N +=N) {
            double time = timeTrial(N);
            StdOut.printf("%6d %7.1f ", N ,time);
            StdOut.printf("%5.1f\n", time/prev);
            prev = time;
        }
    }
}
