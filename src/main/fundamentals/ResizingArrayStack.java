package main.fundamentals;

import java.util.Iterator;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 下压栈
 * @date 2019/4/25 14:24
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];// 栈元素
    private int N = 0; // 元素数量

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        // 将栈移动到一个大小为max的新数组
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        // 将元素添加到栈顶
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        // 从栈顶删除元素
        Item item = a[--N];
        a[N] = null;// 避免对象游离
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    // inner class
    private class ReverseArrayIterator implements Iterator<Item> {
        // 支持后进先出的迭代
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
