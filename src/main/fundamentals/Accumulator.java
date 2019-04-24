package main.fundamentals;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 累加器
 * @date 2019/4/24 10:44
 */
public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
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
