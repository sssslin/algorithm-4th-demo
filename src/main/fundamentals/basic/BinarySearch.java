package main.fundamentals.basic;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 作用:将输入中所有不在通过命令行指定的白名单中的数字打印出来
 * @date 2019/4/17 14:03
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            // 数组必须是有序的
            // 被查找的键要么不存在，要么必然存在于a[lo...hi]
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // java BinarySearch largeW.txt < largeT.txt
    // 通过二分法到largeW中找,如果从largeT中取出的数据在largeW中没找到,
    // 就打印该数字
    // 从tinyW中取出的数字,如果在tinyT中不存在,就打印出来,查找所用的方法就是二分法
    public static void main(String[] args) {
        // tinyW中的数字为白名单
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            // 从文件tinyT中拿到输入
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1) {
                StdOut.println(key);
            }
        }
    }
}
