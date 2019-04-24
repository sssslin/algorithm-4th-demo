package main.fundamentals;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description date测试用例
 * @date 2019/4/24 10:31
 */
public class DateTest {
    public static void main(String[] args) {
        int m = Integer.parseInt("12");
        int d = Integer.parseInt("31");
        int y = Integer.parseInt("1999");

        Date date = new SmallDate(m, d, y);
        StdOut.println(date);
    }
}
