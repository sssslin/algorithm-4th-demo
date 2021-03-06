package main.strings;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 基于单词查找树的符号表
 * @date 2019/5/23 14:53
 */
public class TrieST<Value> {

    // 基数
    private static int R = 256;
    // 单词查找树的根节点
    private Node root;

    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    public Value get(String key) {
        Node x = get(root, key, 0);
        if (x == null) return null;
        return (Value) x.val;
    }

    private Node get(Node x, String key, int d) {
        // 返回以x作为根结点的子单词查找树中与key相关联的值
        if (x == null) return null;
        if (d == key.length()) return x;
        // 找到第d个字符所对应的子单词查找树
        char c = key.charAt(d);
        return get(x.next[c], key, d + 1);
    }

    public void put(String key, Value val) {
        root = put(root, key, val, 0);
    }

    private Node put(Node x, String key, Value val, int d) {
        // 如果key存在于以x为根结点的子单词查找树中则更新与它相关联的值
        if (x == null) x = new Node();
        if (d == key.length()) {
            x.val = val;
            return x;
        }

        // 找到第d个字符所对应的子单词查找树
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d + 1);
        return x;
    }
}
