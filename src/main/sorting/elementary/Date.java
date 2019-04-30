package main.sorting.elementary;


/**
 * @author linjunfeng
 * @version V1.0.0
 * Description date实现方法1
 * @date 2019/4/24 10:16
 */
public class Date implements Comparable<Date> {

    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    @Override
    public int compareTo(Date that) {
        if (this.year > that.year) return +1;
        if (this.year < that.year) return -1;

        if (this.month > that.month) return +1;
        if (this.month < that.month) return -1;

        if (this.day > that.day) return +1;
        if (this.day < that.day) return -1;

        return 0;
    }
}
