package main.fundamentals;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 定容字符串栈
 * @date 2019/4/25 11:23
 */
public class FixedCapacityStackOfStrings {

    private String[] a; // stack entries
    private int N; // size

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }
}
