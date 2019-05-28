package main.strings;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description
 * @date 2019/5/28 13:59
 */
public class Node implements Comparable<Node>{

    // 霍夫曼单词查找树中的结点
    // 内部结点不会使用该变量
    private char ch;
    // 展开过程不会使用该变量
    private int freq;
    private final Node left, right;

    Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
    @Override
    public int compareTo(Node that) {

        return this.freq - that.freq;
    }
}
