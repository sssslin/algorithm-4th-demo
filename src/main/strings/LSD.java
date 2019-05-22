package main.strings;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 低位优先的字符串排序
 * @date 2019/5/22 17:09
 */
public class LSD {

    public static void sortO(String[] a, int W) {
        // 通过前w个字符将a[]排序
        int N= a.length;
        int R =256;
        String[] aux = new String[N];
        for (int d = W -1; d >= 0; d--) {

            // 根据第d个字符用建索引计数法排序
            // 计算出现频率
            int[] count = new int[R+1];

            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            // 将频率转换为索引
            for (int r = 0; r < R; r++) {
                count[r +1] += count[r];
            }

            // 将元素分类
            for (int i = 0; i < N; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // 回写
            for (int i = 0; i < N; i++)
                a[i] = aux[i];
        }
    }
}
