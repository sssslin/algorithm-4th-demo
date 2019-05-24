package main.strings;

import static java.util.Objects.hash;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description Rabin-karp指纹字符串查找算法
 * @date 2019/5/24 11:22
 */
public class RabinKarp {

    // 模式字符串(仅拉斯维加斯算法需要)
    private String pat;
    // 模式字符串的散列值
    private long patHash;
    // 模式字符串的长度
    private int M;
    // 一个很大的素数
    private long Q;
    // 字母表的大小
    private int R = 256;
    // R^(M-1) % Q
    private long RM;

    public RabinKarp(String pat) {
        // 保存模式字符串(仅拉斯维加斯算法需要)
        this.pat = pat;
        this.M = pat.length();
        // 请见练习5.3.33
        // Q= longRandomPrime();
        Q = 1L;
        RM = 1;
        // 计算R^(M-1) % Q
        for (int i = 1; i <= M - 1; i++) {
            // 用于减去第一个数字时的计算
            RM = (R * RM) % Q;
            patHash = hash(pat, M);
        }
    }

    // TODO: 2019/5/24 未完待续 
}
