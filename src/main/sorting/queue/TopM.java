package main.sorting.queue;

import edu.princeton.cs.algs4.*;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 一个优先队列的用例
 * @date 2019/5/6 10:35
 */
public class TopM {

    public static void main(String[] args) {
        // 打印输入流中最大的M行
        int M = Integer.parseInt(args[0]);
        MinPQ<Transaction> pq = new MinPQ<>(M + 1);

        while (StdIn.hasNextLine()) {
            // 为下一行输入创建一个元素并放入优先队列中
            // TODO: 2019/5/15 pq.insert方法报错
            //pq.insert(new Transaction(StdIn.readLine()));
            if (pq.size() > M)
                // 如果优先队列中存在M + 1个元素则删除其中最小的元素
                pq.delMin();
        }
        // 最大的M个元素都在优先队列中

        Stack<Transaction> stack = new Stack<>();
        while (!pq.isEmpty()) stack.push(pq.delMin());
        for (Transaction t : stack) {
            StdOut.println(t);
        }
    }
}
