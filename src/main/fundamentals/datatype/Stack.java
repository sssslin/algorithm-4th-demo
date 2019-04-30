package main.fundamentals.datatype;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 下压堆栈（链表实现）
 * @date 2019/4/28 10:46
 */
public class Stack<Item> implements Iterable<Item> {

    // 栈顶（最近添加的元素）
    private Node first;
    // 元素数量
    private int N;

    private class Node {
        // 定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        // 或： N ==0;
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        // 向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        // 从栈顶删除元素
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    // iterator()实现见算法1.4
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item> {

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

    public static void main(String[] args) {
        // 创建一个栈并根据StdIn中的指示压入或弹出字符串
        Stack<String> s = new Stack<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
