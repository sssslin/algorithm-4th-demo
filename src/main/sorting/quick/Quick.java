package main.sorting.quick;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 快速排序
 * @date 2019/5/5 15:43
 */
public class Quick {

    public static void sort(Comparable[] a) {
        // 消除对输入的依赖
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;

        // 切分
        int j = partition(a, lo, hi);

        // 将左半部分a[lo.. j-1]排序
        sort(a, lo, j - 1);
        // 将右半部分a[j+1.. hi]排序
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // 将数组切分为a[lo..i-1], a[i+1..hi]
        // 左右扫描指针
        int i = lo, j = hi + 1;
        // 切分元素
        Comparable v = a[lo];

        while (true) {
            // 扫描左右,检查扫描是否结束并交换元素
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }

        // 将 v = a[j]放入正确的位置
        exch(a, lo, j);
        return j;
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false;   // optimization when reference equals
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
