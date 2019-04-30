package main.fundamentals.datatype;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/4/25 13:35
 */
public class FixedCapacityStack<Item> {

    private Item[] a; // stack entries
    private int N; // size

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return  N;
    }

    public void push(Item item) {
        a[N++] = item;
    }

    public Item pop() {
        return a[--N];
    }
}
