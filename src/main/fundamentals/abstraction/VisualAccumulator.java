package main.fundamentals.abstraction;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 累加器可视化
 * @date 2019/4/24 11:00
 */
public class VisualAccumulator {

    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total/N);
    }

    public double mean() {
        return total/N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): "
                + String.format("%7.5f", mean());
    }
}
