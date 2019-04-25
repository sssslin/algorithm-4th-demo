package main.fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description Queue用例
 * @date 2019/4/25 10:00
 */
public class QueueSample {

    public static int[] readInts(String name) {

        In in = new In(name);
        Queue<Integer> q = new Queue<>();
        while (!in.isEmpty()) {
            q.enqueue(in.readInt());
        }

        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = q.dequeue();
        }
        return a;
    }
}
