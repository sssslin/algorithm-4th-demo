package main.fundamentals.datatype;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/25 13:35
 */
public class FixedCapacityStackTest2 {

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<>(100);

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
