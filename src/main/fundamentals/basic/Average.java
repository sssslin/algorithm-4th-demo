package main.fundamentals.basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 求平均值
 * @date 2019/4/23 11:24
 */
public class Average {
    public static void main(String[] args) {
        // 取StdIn中所有数的平均值
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            // 读取一个数并计算累计之和
            sum += StdIn.readDouble();
            cnt++;
        }
        // 输入完成之后,Ctrl+D结束输入即可
        double avg = sum/ cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
