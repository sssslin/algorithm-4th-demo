package main.strings;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/27 14:17
 */
public class GREP {

    public static void main(String[] args) {
        String regexp = "(.*" + args[0] + ".*)";

        NFA nfa = new NFA(regexp);
        while (StdIn.hasNextLine()) {
            String txt = "todo";
            if (nfa.recognizes(txt)) {
                StdOut.println(txt);
            }
        }
    }
}
