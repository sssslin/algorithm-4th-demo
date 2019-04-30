package main.fundamentals.datatype;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description Stack用例
 * @date 2019/4/25 10:07
 */
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<>();

        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }

        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
