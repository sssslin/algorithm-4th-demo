package main.sorting.elementary;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 排序算法类的模板
 * @date 2019/4/22 10:43
 */
public class Example {

    public static void sort(Comparable[] a) {
        /**请见算法2.1，2.2，2.3，2.4，2.5或2.7
         *
         */
    }
    // 通过提升速度来解决其他方式无法解决的问题是研究算法
    // 的设计和性能的主要原因之一
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

    public static void main(String[] args) {
        // 从标准输入读取字符串,将它们排序并输出
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
