package main.fundamentals.cases;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description union-find算法的实现（加权quick-union算法）
 * @date 2019/4/30 10:27
 */
public class WeightedQuickUnionUF {

    // 父链接数组（由触点索引）
    private int[] id;
    // (由触点索引的)各个结点所对应的分量的大小
    private int[] sz;
    // 连通分量的数量
    private int count;

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    private int find(int p) {
        // 跟随链接找到根节点
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        // 将小树的根节点连接到大树的跟结点
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public static void main(String[] args) {
        // 解决由StdIn得到的动态连通性问题
        // 读取触点数量
        int N = StdIn.readInt();
        // 初始化N个分量
        UF uf = new UF(N);

        while (!StdIn.isEmpty()) {
            // 读取整数对
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            // 如果已经连通则忽略
            if (uf.connected(p, q)) {
                continue;
            }
            // 归并分量
            uf.union(p, q);
            // 打印连接
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
