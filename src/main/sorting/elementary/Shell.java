package main.sorting.elementary;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 希尔排序（不理解为什么要这么分组，排序的效率最高）
 * @date 2019/4/23 10:08
 */
public class Shell {
    public static void sort(Comparable[] a) {
        // 将a[]按升序排列
        int N = a.length;
        int h = 1;
        while (h < N/3) {
            // 1,4,13,40,121,364,1093,....
            h = 3 * h + 1;
        }

        while (h >= 1) {
         // 将数组变为h有序
            for (int i = h; i < N; i++) {
                // 将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中
                for (int j = i; j >= h && less(a[j], a[j-h]);j -= h){
                    exch(a, j, j-h);
                }
            }
            h = h/ 3;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        // 在单行中打印数组
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        // 测试数组元素是否有效
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1]))
                return false;
        }
        return true;
    }
}
