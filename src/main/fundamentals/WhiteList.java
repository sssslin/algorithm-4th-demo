package main.fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 典型用例
 * @date 2019/4/24 11:18
 */
public class WhiteList {
    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        StaticSETofInts set = new StaticSETofInts(w);

        // TODO: 2019/4/24 测试结果与书本上不一致
        // TODO: 2019/4/24 BinarySearch之前执行结果与书本一致,结果重新执行BinarySearch,结果也变了,可能问题出在largeW.txt
        // TODO: 2019/4/24 largeT.txt上
        while (!StdIn.isEmpty()) {
            // 读取键,如果不在白名单中则打印它
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
