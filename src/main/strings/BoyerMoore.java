package main.strings;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description Boyey-Moore字符串匹配算法(启发式地处理不匹配的字符)
 * @date 2019/5/24 11:00
 */
public class BoyerMoore {

    private int[] right;

    private String pat;

    BoyerMoore(String pat) {

        // 计算跳跃表
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        right = new int[R];

        for (int c = 0; c < R; c++) {
            // 不包含在模式字符串中的字符串的值为-1
            right[c] = -1;
        }
        // 包含在模式字符串中的字符的值为
        for (int j = 0; j < M; j++) {
            // 它在其中出现的最右位置
        }
    }

    public int search(String txt) {
        // 在TXT中查找模式字符串
        int N = txt.length();
        int M = pat.length();
        int skip;
        for (int i = 0; i <= N-M; i+= skip) {
            // 模式字符串和文本在位置i匹配吗?
            skip =0;
            for (int j = M-1; j >=0 ; j--)
                if (pat.charAt(j) != txt.charAt(i+j)) {
                    skip = j - right[txt.charAt(i+j)];
                    if (skip < 1) skip =1;
                    break;
                }// 找到匹配
                if (skip ==0) return i;
            }// 未找到匹配
            return N;
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
