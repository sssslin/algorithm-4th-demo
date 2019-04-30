package main.fundamentals.datatype;

import java.util.Iterator;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 背包
 * @date 2019/4/28 11:58
 */
public class Bag<Item> implements Iterable<Item> {

    // 链表的首结点
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        // 和Stack的push()方法完全相同
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }
}
