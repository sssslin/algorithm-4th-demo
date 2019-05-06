package main.sorting.quick;

import java.util.Comparator;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 三向切分的快速排序
 * @date 2019/5/6 9:42
 */
public class Quick3way {

    private static void sort(Comparable[] a, int lo, int hi) {

        if (hi <= lo) return;;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v= a[lo];

        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if  (cmp < 0) exch(a, lt++, i++);
            else if (cmp >0) exch(a, i, gt--);
            else  i++;
        }
        // 现在a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi]成立
        sort(a, lo, lt -1);
        sort(a, gt + 1, hi);
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void sort(Object[] a, Comparator c)
    {
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0 && less(c, a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

    private static boolean less(Comparator c, Object v, Object w)
    { return c.compare (v, w) < 0; }
}
