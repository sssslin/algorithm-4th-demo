package main.search;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 基于拉链法的散列表
 * @date 2019/5/10 9:50
 */
public class SeparateChainingHashST<Key, Value> {

    // 键值对总数
    private int N;

    // 散列表的大小
    private int M;

    // 存放链表对象的数组
    private SequentialSearchST<Key, Value>[] st;

    public SeparateChainingHashST() {
        this(997);
    }

    public SeparateChainingHashST(int M) {
        // 创建M条链表
        this.M = M;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
        for (int i = 0; i < M; i++) {
            st[i] = new SequentialSearchST();
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) {
        return (Value) st[hash(key)].get(key);
    }

    public void put(Key key, Value value) {
        st[hash(key)].put(key, value);
    }
    // 缺少Iterable
}
