package main.sorting.merge;




/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 自顶向下的归并排序
 * @date 2019/5/5 10:29
 */
public class Merge {

    // 归并所需的辅助数组
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {

        // 一次性分配空间
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        // 将数组a[lo..hi]排序
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        // 将左边排序
        sort(a, lo, mid);
        // 将右边排序
        sort(a, mid + 1, hi);
        // 归并结果
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // 将a[lo..mid]和a[mid+1..hi]归并
        int i = lo, j = mid + 1;
        // 将a[lo..hi]复制到aux[lo..hi]
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        // 归并回到a[lo..hi]
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                   a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
