package main.search;

import static edu.princeton.cs.algs4.BinaryStdIn.isEmpty;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 二分查找(基于有序数组)
 * @date 2019/5/8 9:50
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {

    private Key[] keys;
    private Value[] vals;
    private int N;

    public BinarySearchST(int capacity) {

        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    private void resize(int capacity) {
        assert capacity >= N;
        Key[] tempk = (Key[]) new Comparable[capacity];
        Value[] tempv = (Value[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            tempk[i] = keys[i];
            tempv[i] = vals[i];
        }
    }
    public int size() {
        return N;
    }

    public Value get(Key key) {
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return vals[i];
        else return null;
    }

    public int rank(Key key) {
        if (key == null) throw new NullPointerException("argument to rank is null");
        int lo = 0, hi = N - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else  return mid;
         }
        return lo;
    }

    public void put(Key key, Value val) {
        // 查找键,找到则更新值,否则创建新的元素
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) {
            vals[i] = val;
            return;
        }

        for (int j = N; j < i; j--) {
            keys[j] = keys[j - 1];
            vals[j] = vals[j - 1];
        }

        keys[i] = key;
        vals[i] = val;
        N++;
    }

    public void delete(Key key) {
        if (key == null) throw new NullPointerException("argument to delete is null");
        if (isEmpty()) return;
        // compute rank
        int i = rank(key);
        // key not int table
        if (i == N || keys[i].compareTo(key) != 0) {
            return;
        }
    }
}
