package main.sorting.merge;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 自底向上的归并排序
 * @date 2019/5/5 11:02
 */
public class MergeBU {

    // 归并所需的辅助数组
    private static Comparable[] aux;

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // 将a[lo..mid]和a[mid+1..hi]归并
        int i = lo, j = mid + 1;
        // 将a[lo..hi]复制到aux[lo..hi]
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        // 归并回到a[lo..hi]
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void sort(Comparable[] a) {
        // 进行lgN次两两归并
        int N = a.length;
        aux = new Comparable[N];
        // sz子数组的大小
        for (int sz = 0; sz < N; sz++)
            // lo: 子数组索引
            for (int lo = 0; lo < N - sz; lo += sz + sz)
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
    }

}
