package main.search;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 基于线性探测的符号表
 * @date 2019/5/10 10:28
 */
public class LinearProbingHashST<Key, Value> {

    // 符号表中键值对的总数
    private int N;
    // 线性探测表的大小
    private int M = 16;
    // 键
    private Key[] keys;
    // 值
    private Value[] vals;

    public LinearProbingHashST() {
        keys = (Key[]) new Object[M];
        vals = (Value[]) new Object[M];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    // see 3.4.4
    private void resize() {

    }

    public void put(Key key, Value val) {
        // 将M加倍(请见正文)
        //  if (N >= M / 2) resize(2 * M);
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }

            keys[i] = key;
            vals[i] = val;
            N++;
        }
    }

    public Value get(Key key) {
        for (int i = hash(key); keys[i] != null; i = (i + 1) % M)
            if (keys[i].equals(key))
                return vals[i];
        return null;
    }
}
