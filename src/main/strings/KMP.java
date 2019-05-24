package main.strings;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description Knuth-Morris-Pratt字符串查找算法
 * @date 2019/5/24 10:33
 */
public class KMP {

    private String pat;
    private int[][] dfa;

    public KMP(String pat) {
        // 由模式字符串构造DFA
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;

        for (int X = 0, j = 1; j < M; j++) {
            // 计算dfa[][]
            for (int c = 0; c < R; c++)
                // 复制匹配失败情况下的值
                dfa[c][j] = dfa[c][X];
            // 设置匹配成功状况下的值
            dfa[pat.charAt(j)][j] = j + 1;
            // 更新重启状态
            X = dfa[pat.charAt(j)][X];
        }
    }

    public int serarch(String txt) {
        // 在txt上模拟DFA的运行
        int i, j, N = txt.length(), M = pat.length();
        for (i = 0, j = 0; i < N && j < M; i++)
            j = dfa[txt.charAt(i)][j];
        // 找到匹配(到达模式字符串的结尾)
        if (j == M) return i - M;
        // 未找到文本字符串的结尾
        else return N;
    }

    public static void main(String[] args) {
        String pat = args[0];
        String txt = args[1];
        KMP kmp = new KMP(pat);

        StdOut.println("text:   " + txt );
        int offset = kmp.serarch(txt);
        for (int i = 0; i < offset; i++) {
            StdOut.println(" ");
        }

        StdOut.println(pat);
    }
}
