package main.context;

import edu.princeton.cs.algs4.FlowNetwork;

/**
 * @Author: LinJunFeng
 * @Date: 2019-05-30 08:05
 * @Description:
 * @Version: 1.0.0
 **/
public class FordFulkerson {

    // 在剩余网络中是否存在从s到v的路径?
    private boolean[] marked;
    // 从s到v的最短路径上的最后一条边
    private FlowEdge[] edgeTo;
    // 当前最大流量
    private double value;

    public FordFulkerson(FlowNetwork G, int s, int t) {
        // 找出从s到t的流量网络G的最大流量配置
        while (true) {
            // 利用所有存在的增广路径
            // 计算当前的瓶颈容量
        }
    }
}
