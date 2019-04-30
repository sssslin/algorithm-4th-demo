package main.fundamentals.basic;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 二分查找的递归实现
 * @date 2019/4/19 15:58
 */
public class BinarySearchUsingRecursion {

    public static int rank(int key, int[] a) {

        return rank(key, a, 0, a.length - 1);
    }

    /**
     * 编写递归代码时最重要的有以下3点
     * 1。递归总有一个最简单的情况--方法的第一条语句总是一个包含return的条件语句
     * 2. 递归调用总是尝试去解决一个规模更小的子问题，这样递归才能收敛到最简单的情况
     * 在下面的代码中，第四个参数和第三个参数的差值一直在缩小
     * 3.递归调用的父问题和尝试解决的子问题之间不应该有交集.
     * 在下面代码中,两个子问题各自操作的数组部分是不同的
     */
    private static int rank(int key, int[] a, int lo, int hi) {
        // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {

            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {

            return rank(key, a, mid + 1, hi);
        } else {

            return mid;
        }
    }
}
