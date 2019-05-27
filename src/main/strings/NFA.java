package main.strings;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Stack;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 正则表达式的模式匹配（grep）
 * @date 2019/5/27 10:30
 */
public class NFA {

    // 匹配转换
    private char[] re;
    // epsilon转换
    private Digraph G;
    // 状态数量
    private int M;

    public NFA(String regexp) {

        // 根据给定的正则表达式构造NFA
        Stack<Integer> ops = new Stack<>();
        re = regexp.toCharArray();
        M = re.length;
        G = new Digraph(M + 1);

        for (int i = 0; i < M; i++) {
            int lp = i;
            if (re[i] == '(' || re[i] == '|')
                ops.push(i);
            else if (re[i] == ')') {
                int or = ops.pop();
                if (re[or] == '|') {
                    lp = ops.pop();
                    G.addEdge(lp, or + 1);
                    G.addEdge(or, i);
                } else lp = or;
            }
            // 查看下一个字符
            if (i < M - 1 && re[i + 1] == '*') {
                G.addEdge(lp, i + 1);
                G.addEdge(i + 1, lp);
            }

            if (re[i] == '(' || re[i] == '*' || re[i] == ')')
                G.addEdge(i, i + 1);
        }
    }

    public boolean recognizes(String txt) {
        // TODO: 2019/5/27 见5.4,5.2
        return false;
    }
}
