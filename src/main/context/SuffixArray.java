package main.context;

import edu.princeton.cs.algs4.Quick3way;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/29 14:59
 */
public class SuffixArray {

    // 后缀数组
    private final String[] suffixes;
    // 字符串(和数组)的长度
    private final int N;

    public SuffixArray(String s) {
        N = s.length();
        suffixes = new String[N];
        for (int i = 0; i < N; i++)
            suffixes[i] = s.substring(i);
        Quick3way.sort(suffixes);
    }

    public int length() {
        return N;
    }

    public String select(int i) {
        return suffixes[i];
    }

    public int index(int i) {
        return N - suffixes[i].length();
    }

    // TODO: 2019/5/29 todo
    public int lcp(int i) {
        return 1;
    }

    public int rank(String key) {
        int lo = 0, hi = N - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(suffixes[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
}
