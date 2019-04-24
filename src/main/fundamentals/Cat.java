package main.fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description In和Out测试用例
 * @date 2019/4/23 15:35
 */
public class Cat {
    public static void main(String[] args) {
        // 将所有输入文件复制到输出流（最后一个参数）中
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            // 将第i个输入文件复制到输出流中
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
