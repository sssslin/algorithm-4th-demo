package main.sorting.elementary;

import edu.princeton.cs.algs4.*;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 排序算法比较
 * @date 2019/4/22 13:46
 */
public class SortCompare {

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("D:\\workspace\\private\\java\\algorithm-4th-demo\\src\\main\\sort\\Insertion")) Insertion.sort(a);
        if (alg.equals("D:\\workspace\\private\\java\\algorithm-4th-demo\\src\\main\\sort\\Selection")) Selection.sort(a);
        if (alg.equals("D:\\workspace\\private\\java\\algorithm-4th-demo\\src\\main\\sort\\Shell")) Shell.sort(a);
        if (alg.equals("Merge")) Merge.sort(a);
        if (alg.equals("Quick")) Quick.sort(a);
        if (alg.equals("Heap")) Heap.sort(a);

        return timer.elapsedTime();

    }

    public static double timeRandomInput(String alg, int N, int T) {
        // 使用算法1将T个长度为N的数组排序
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++)
        { // 进行一次测试（生成一个数组并排序)
            for (int i = 0; i < N; i++)
                a[i] = StdRandom.uniform();
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "D:\\workspace\\private\\java\\algorithm-4th-demo\\src\\main\\sort\\Shell";
        String alg2 = "D:\\workspace\\private\\java\\algorithm-4th-demo\\src\\main\\sort\\Insertion";
        int N = Integer.parseInt("100000");
        int T = Integer.parseInt("100");

        double t1 = timeRandomInput(alg1, N, T); // 算法1的总时间
        double t2 = timeRandomInput(alg2, N, T); // 算法2的总时间
        StdOut.printf("For %d random Doubles\n %s is" , N, alg1);
        StdOut.printf(" %.1f times faster than %s\n" , t2/t1, alg2);
    }
}
