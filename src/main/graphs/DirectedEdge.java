package main.graphs;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 加权有向边的数据类型
 * @date 2019/5/20 9:14
 */
public class DirectedEdge {

    // 边的起点
    private final int v;
    // 边的终点
    private final int w;
    // 边的权重
    private final double weight;

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    @Override
    public String toString() {
        return String.format("%d->%d %.2f", v, w, weight);
    }
}
