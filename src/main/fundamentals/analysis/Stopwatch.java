package main.fundamentals.analysis;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/28 14:18
 */
public class Stopwatch {

    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
