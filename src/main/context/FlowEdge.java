package main.context;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 流量网络中的边(剩余网络)
 * @date 2019/5/29 15:31
 */
public class FlowEdge {

    // 边的起点
    private final int v;
    // 边的终点
    private final int w;
    // 容量
    private final double capacity;
    //流量
    private double flow;

    public FlowEdge(int v, int w, double capacity) {
        this.v = v;
        this.w = w;
        this.capacity = capacity;
        this.flow = 0.0;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public double capacity() {
        return capacity;
    }

    public double flow() {
        return flow;
    }

    public int other(int vertex) {
        // TODO: 2019/5/29
        return 1;
    }

    public double residualCapacityTo(int vertex) {
        if (vertex == v) return flow;
        else if (vertex == w) return capacity - flow;
        else throw new RuntimeException("Inconsistent edge");
    }

    public void addResidualFlowTo(int vertex, double delta) {
        if (vertex == v) flow -= delta;
        else if (vertex == w) flow += delta;
        else throw new RuntimeException("Inconsistent edge");
    }

    @Override
    public String toString() {
        return String.format("%d->%d %.2f %.2f", v, w, capacity, flow);
    }
}
