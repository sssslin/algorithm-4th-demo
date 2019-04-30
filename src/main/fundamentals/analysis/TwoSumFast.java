package main.fundamentals.analysis;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import main.fundamentals.basic.BinarySearch;

import java.util.Arrays;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/28 16:55
 */
public class TwoSumFast {

    public static int count(int[] a) {
        // 计算和为0的整数对的数目
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
