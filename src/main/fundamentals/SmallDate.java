package main.fundamentals;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description date实现2
 * @date 2019/4/24 10:27
 */
public class SmallDate implements Date {

    private final int value;

    public SmallDate(int m, int d, int y) {
        value = y * 512 + m * 32 + d;
    }

    @Override
    public int month() {
        return (value / 32) % 16;
    }

    @Override
    public int day() {
        return value % 32;
    }

    @Override
    public int year() {
        return value / 512;
    }

    @Override
    public String toString() {
        return month() + "/" + day()
                + "/" + year();
    }
}
