package main.fundamentals;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description date实现方法1
 * @date 2019/4/24 10:16
 */
public class BasicDate implements Date {

    private final int month;
    private final int day;
    private final int year;

    public BasicDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    @Override
    public int month() {
        return month;
    }

    @Override
    public int day() {
        return day;
    }

    @Override
    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        BasicDate that = (BasicDate) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

}
