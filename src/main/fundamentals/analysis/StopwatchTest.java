package main.fundamentals.analysis;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/28 14:13
 */
public class StopwatchTest {

    public static void main(String[] args) {
        int N = Integer.parseInt("2000");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000,1000000);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        StdOut.println(cnt + " triples " + time + " seconds");
    }
}
