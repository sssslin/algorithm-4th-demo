package main.sorting.queue;

import java.util.Comparator;
import java.util.Date;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 使用比较器实现的优先队列
 * @date 2019/5/7 13:32
 */
public class Transaction {

    private String who;
    private Date when;
    private double amount;

    public static class WhoOrder implements Comparator<Transaction> {

        @Override
        public int compare(Transaction v, Transaction w) {
            return v.who.compareTo(w.who);
        }
    }

    public static class WhenOrder implements Comparator<Transaction> {

        @Override
        public int compare(Transaction v, Transaction w) {
            return v.when.compareTo(w.when);
        }
    }

    public static class HowMuchOrder implements Comparator<Transaction> {

        @Override
        public int compare(Transaction v, Transaction w) {
            if (v.amount < w.amount) return -1;
            if (v.amount > w.amount) return +1;
            return 0;
        }
    }
}
